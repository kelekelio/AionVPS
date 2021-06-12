package pl.aionpb.aion.assembles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.assembles.entity.AssembleEntity;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface AssembleRepository extends JpaRepository<AssembleEntity, Integer>, JpaSpecificationExecutor {
    Optional<AssembleEntity> findByName(String name);
}
