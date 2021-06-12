package pl.aionpb.aion.toypets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.toypets.entity.ToypetDopingEntity;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface ToypetDopingRepository extends JpaRepository<ToypetDopingEntity, Integer>, JpaSpecificationExecutor {
    Optional<ToypetDopingEntity> findByName(String name);
}
