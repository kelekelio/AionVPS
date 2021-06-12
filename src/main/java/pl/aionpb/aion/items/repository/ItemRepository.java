package pl.aionpb.aion.items.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.items.entity.ItemEntity;

import java.util.List;
import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Integer>, JpaSpecificationExecutor {


    List<ItemEntity> findAllByEquipmentSlots(String quipmentSlots);

    List<ItemEntity> findAllByWeaponType(String weaponType);

    List<ItemEntity> findAllByArmorType(String slot);

    List<ItemEntity> findAllByIdBetween (Integer lowestId, Integer highestId);

    Optional<ItemEntity> findByName(String name);

}
