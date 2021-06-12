package pl.aionpb.aion.toypets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.aionpb.aion.toypets.entity.ToypetWarehouseEntity;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
public interface ToypetWarehouseRepository extends JpaRepository<ToypetWarehouseEntity, Integer>, JpaSpecificationExecutor {
    Optional<ToypetWarehouseEntity> findByName(String name);
}
