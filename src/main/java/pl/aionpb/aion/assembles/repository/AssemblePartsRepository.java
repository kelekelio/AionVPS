package pl.aionpb.aion.assembles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.assembles.entity.AssemblePartsEntity;

import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface AssemblePartsRepository extends JpaRepository<AssemblePartsEntity, Integer>, JpaSpecificationExecutor {

    List<AssemblePartsEntity> findAllByName(String name);
    List<AssemblePartsEntity> findAllByPartItem(String name);
}
