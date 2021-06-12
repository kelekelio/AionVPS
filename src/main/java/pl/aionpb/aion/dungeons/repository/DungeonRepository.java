package pl.aionpb.aion.dungeons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.dungeons.entity.DungeonEntity;

import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface DungeonRepository extends JpaRepository<DungeonEntity, Integer> {
    List<DungeonEntity> findAll();
}