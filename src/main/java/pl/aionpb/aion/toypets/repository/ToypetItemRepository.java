package pl.aionpb.aion.toypets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.toypets.entity.ToypetItemEntity;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface ToypetItemRepository extends JpaRepository<ToypetItemEntity, Integer>, JpaSpecificationExecutor {
    Optional<ToypetItemEntity> findByName(String name);
}
