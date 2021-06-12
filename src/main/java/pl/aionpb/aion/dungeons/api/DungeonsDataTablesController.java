package pl.aionpb.aion.dungeons.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.aionpb.aion.dungeons.entity.DungeonEntity;
import pl.aionpb.aion.dungeons.repository.DungeonsDataTablesRepository;
import pl.aionpb.aion.dungeons.service.DungeonsDataTablesService;

import javax.validation.Valid;

/**
 * @author Grzegorz Nowakowski
 */
@RestController
public class DungeonsDataTablesController {

    @Autowired
    private DungeonsDataTablesRepository dungeonsDataTablesRepository;

    @Autowired
    private DungeonsDataTablesService dungeonsDataTablesService;


    @RequestMapping(value = {"/dungeonsajax"}, method = RequestMethod.GET)
    public DataTablesOutput<DungeonEntity> listDataTablesForDungeonsGET(@Valid DataTablesInput input) {

        return dungeonsDataTablesService.findAll(input);
    }

    @RequestMapping(value = "/dungeonsajax", method = RequestMethod.POST)
    public DataTablesOutput<DungeonEntity> listDataTablesForDungeonsPOST(@Valid @RequestBody DataTablesInput input) {
        return dungeonsDataTablesService.findAll(input);
    }
}