package pl.aionpb.aion.dungeons.repository;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import pl.aionpb.aion.dungeons.entity.DungeonEntity;

/**
 * @author Grzegorz Nowakowski
 */
public interface DungeonsDataTablesRepository extends DataTablesRepository<DungeonEntity, Integer> {

    DataTablesOutput<DungeonEntity> findAll(DataTablesInput input);

}
