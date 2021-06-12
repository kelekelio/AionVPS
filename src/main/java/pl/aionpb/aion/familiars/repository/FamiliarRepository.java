package pl.aionpb.aion.familiars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.familiars.entity.FamiliarEntity;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface FamiliarRepository extends JpaRepository<FamiliarEntity, Integer>, JpaSpecificationExecutor {
    Optional<FamiliarEntity> findByName(String name);
}
