package pl.aionpb.aion.translation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.aionpb.aion.translation.entity.TranslationEntity;

/**
 * @author Grzegorz Nowakowski
 */
@Repository
public interface  TranslationRepository extends JpaRepository<TranslationEntity, Integer> {

    TranslationEntity findByName (String name);

}
