package pl.aionpb.aion.items.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import pl.aionpb.aion.items.entity.ItemEntity;

/**
 * @author Grzegorz Nowakowski
 */
public interface ItemDataTablesRepository extends DataTablesRepository<ItemEntity, Integer> {

}
