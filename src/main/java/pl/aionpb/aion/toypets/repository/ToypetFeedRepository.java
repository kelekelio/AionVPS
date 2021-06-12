package pl.aionpb.aion.toypets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.toypets.entity.ToypetFeedEntity;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface ToypetFeedRepository extends JpaRepository<ToypetFeedEntity, Integer>, JpaSpecificationExecutor {
    Optional<ToypetFeedEntity> findByName(String name);
}
