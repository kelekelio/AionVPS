package pl.aionpb.aion.dungeons.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;
import pl.aionpb.aion.dungeons.entity.DungeonEntity;
import pl.aionpb.aion.dungeons.repository.DungeonsDataTablesRepository;
import pl.aionpb.aion.translation.service.TranslationService;

/**
 * @author Grzegorz Nowakowski
 */
@Service
public class DungeonsDataTablesService {

    @Autowired
    DungeonsDataTablesRepository dungeonsDataTablesRepository;

    @Autowired
    private TranslationService translationService;

    public DataTablesOutput<DungeonEntity> findAll(DataTablesInput input) {

        DataTablesOutput<DungeonEntity> dungeons = dungeonsDataTablesRepository.findAll(input);

        dungeons.getData().forEach(dungeonEntity -> dungeonEntity
                .setDescription(
                        translationService.findByName(dungeonEntity.getDescription()).getLocaString()
                )
        );
        dungeons.getData().forEach(dungeonEntity -> dungeonEntity.setRace("<span class=\"pc_light\"></span> <span class=\"pc_dark\"></span>"));

        return dungeons;
    }


}