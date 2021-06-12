package pl.aionpb.aion.toypets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.toypets.entity.ToypetBuffEntity;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface ToypetBuffRepository  extends JpaRepository<ToypetBuffEntity, Integer>, JpaSpecificationExecutor {
    Optional<ToypetBuffEntity> findByName(String name);
}
