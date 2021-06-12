package pl.aionpb.aion.toypets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.toypets.entity.ToypetLootingEntity;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface ToypetLootingRepository extends JpaRepository<ToypetLootingEntity, Integer>, JpaSpecificationExecutor {
    Optional<ToypetLootingEntity> findByName(String name);
}
