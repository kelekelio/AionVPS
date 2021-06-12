package pl.aionpb.aion.toypets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.toypets.entity.ToypetEntity;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface ToypetRepository extends JpaRepository<ToypetEntity, Integer>, JpaSpecificationExecutor {
    Optional<ToypetEntity> findByName(String name);
}
