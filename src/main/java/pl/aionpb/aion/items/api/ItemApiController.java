package pl.aionpb.aion.items.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.aionpb.aion.items.entity.ItemEntity;
import pl.aionpb.aion.items.repository.ItemRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@RestController
public class ItemApiController {

    @Autowired
    private ItemRepository itemRepository;


    @GetMapping("/api/item/{id}")
    public ResponseEntity<ItemEntity> getItemById(@PathVariable("id") Integer id) {

        Optional<ItemEntity> item = itemRepository.findById(id);
        return item.map(itemEntity -> new ResponseEntity<>(itemEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));



    }

    @GetMapping("/api/item/{column}/{value}")
    public List<ItemEntity> getItemByColumnAndValue(@PathVariable("column") String column, @PathVariable("value") String value) {

        return itemRepository.findAll(byColumnNameAndValue(column, value));

    }




    // list all items by providing a column name and value.
    // breaks if you provide a string with id as the column
    public static Specification<ItemEntity> byColumnNameAndValue(String columnName, String value) {
        return (Specification<ItemEntity>) (root, query, builder) -> builder.equal(root.<String>get(columnName), value);
    }


}