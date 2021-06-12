package pl.aionpb.aion.items.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.Column;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.datatables.mapping.Search;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;
import pl.aionpb.aion.db.object.Settings;
import pl.aionpb.aion.items.entity.ItemEntity;
import pl.aionpb.aion.items.object.ItemIdRangeObj;
import pl.aionpb.aion.items.object.ItemObj;
import pl.aionpb.aion.items.repository.ItemDataTablesRepository;
import pl.aionpb.aion.translation.service.TranslationService;

import javax.validation.Valid;

/**
 * @author Grzegorz Nowakowski
 */
@RestController
public class ItemsDataTablesController {

    @Autowired
    private ItemDataTablesRepository itemDataTablesRepository;

    @Autowired
    private TranslationService translationService;


    @RequestMapping(value = {"/itemajax", "/itemajax/{type}"}, method = RequestMethod.GET)
    public DataTablesOutput<ItemEntity> list(@PathVariable(required = false) String type, @Valid DataTablesInput input) {


        String code = Settings.getLocaCode();
        //extra column added to the search results
        input.getColumns().add(7, new Column("ko", null, true, false, new Search(null, false)));
        input.getColumns().add(8, new Column(code, null, true, false, new Search(null, false)));

        ItemIdRangeObj idRange = new ItemIdRangeObj();
        idRange.setIdRangeBasedOnType(type);



        Specification<ItemEntity> itemEntitySpecification = (Specification<ItemEntity>) (root, query, criteriaBuilder) -> {

            //Expression<String> weaponTypeExpression = criteriaBuilder.lower(root.get("weaponType"));

            return criteriaBuilder.and(
                    criteriaBuilder.between(root.get("id"), idRange.getMin(), idRange.getMax())
            );

/* example
            return criteriaBuilder.and(
                    criteriaBuilder.and(
                            criteriaBuilder.between(root.get("price"), 5, 500)
                    ),
                    criteriaBuilder.and(
                            criteriaBuilder.equal(weaponTypeExpression, "1h_dagger")
                    )
            );

            return criteriaBuilder.or(
                    criteriaBuilder.and(
                            criteriaBuilder.equal(firstNameExpression, parts[0]),
                            criteriaBuilder.like(lastNameExpression, parts[1] + "%", '~')
                    ),
                    criteriaBuilder.and(
                            criteriaBuilder.equal(lastNameExpression, parts[0]),
                            criteriaBuilder.like(firstNameExpression, parts[1] + "%", '~')
                    )
            );
             */

        };



        DataTablesOutput<ItemEntity> data = itemDataTablesRepository.findAll(input, itemEntitySpecification);
        data.getData().forEach(itemEntity -> itemEntity
                .setIconName(
                        ItemObj.finalIconLink(itemEntity.getIconName())
                ) );
        data.getData().forEach(itemEntity -> itemEntity.setDescription(
                translationService.findByName(itemEntity.getDescription()).getLocaString()
                )
        );

        return data;
    }

    /*
    Specification<ItemEntity> itemEntitySpecification = (Specification<ItemEntity>) (root, query, criteriaBuilder) -> {
            //Expression<String> weaponTypeExpression = criteriaBuilder.lower(root.get("weaponType"));
            return criteriaBuilder.and(criteriaBuilder.between(root.get("id"), idRange.getMin(), idRange.getMax()));
            };
     */

    @RequestMapping(value = "/itemajax", method = RequestMethod.POST)
    public DataTablesOutput<ItemEntity> listPOST(@Valid @RequestBody DataTablesInput input) {
        System.out.println(input.getColumns());
        DataTablesOutput<ItemEntity> items = itemDataTablesRepository.findAll(input);

        return items;
    }













}