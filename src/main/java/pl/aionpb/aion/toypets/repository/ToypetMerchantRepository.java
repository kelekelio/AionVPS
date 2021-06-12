package pl.aionpb.aion.toypets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.aionpb.aion.toypets.entity.ToypetMerchantEntity;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
public interface ToypetMerchantRepository extends JpaRepository<ToypetMerchantEntity, Integer>, JpaSpecificationExecutor {
    Optional<ToypetMerchantEntity> findByName(String name);
}
