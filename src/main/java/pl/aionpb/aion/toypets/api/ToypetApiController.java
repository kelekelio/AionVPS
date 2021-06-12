package pl.aionpb.aion.toypets.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.aionpb.aion.toypets.entity.*;
import pl.aionpb.aion.toypets.repository.*;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@RestController
public class ToypetApiController {

    @Autowired
    ToypetWarehouseRepository warehouseRepository;
    @Autowired
    ToypetMerchantRepository merchantRepository;
    @Autowired
    ToypetLootingRepository lootingRepository;
    @Autowired
    ToypetItemRepository toypetItemRepository;
    @Autowired
    ToypetFeedRepository toypetFeedRepository;
    @Autowired
    ToypetDopingRepository toypetDopingRepository;
    @Autowired
    ToypetBuffRepository toypetBuffRepository;
    @Autowired
    ToypetRepository toypetRepository;


    @GetMapping("/api/toypet/warehouse/{name}")
    public ResponseEntity<ToypetWarehouseEntity> getToypetWarehouseByName(@PathVariable("name") String name) {
        Optional<ToypetWarehouseEntity> entity = warehouseRepository.findByName(name);
        return entity.map(ToypetWarehouseEntity -> new ResponseEntity<>(ToypetWarehouseEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/api/toypet/merchant/{name}")
    public ResponseEntity<ToypetMerchantEntity> getToypetMerchantByName(@PathVariable("name") String name) {
        Optional<ToypetMerchantEntity> entity = merchantRepository.findByName(name);
        return entity.map(ToypetMerchantEntity -> new ResponseEntity<>(ToypetMerchantEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/api/toypet/looting/{name}")
    public ResponseEntity<ToypetLootingEntity> getToypetLootingByName(@PathVariable("name") String name) {
        Optional<ToypetLootingEntity> entity = lootingRepository.findByName(name);
        return entity.map(ToypetLootingEntity -> new ResponseEntity<>(ToypetLootingEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/api/toypet/item/{name}")
    public ResponseEntity<ToypetItemEntity> getToypetItemByName(@PathVariable("name") String name) {
        Optional<ToypetItemEntity> entity = toypetItemRepository.findByName(name);
        return entity.map(ToypetItemEntity -> new ResponseEntity<>(ToypetItemEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/api/toypet/feed/{name}")
    public ResponseEntity<ToypetFeedEntity> getToypetFeedByName(@PathVariable("name") String name) {
        Optional<ToypetFeedEntity> entity = toypetFeedRepository.findByName(name);
        return entity.map(ToypetFeedEntity -> new ResponseEntity<>(ToypetFeedEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/api/toypet/doping/{name}")
    public ResponseEntity<ToypetDopingEntity> getToypetDopingByName(@PathVariable("name") String name) {
        Optional<ToypetDopingEntity> entity = toypetDopingRepository.findByName(name);
        return entity.map(ToypetDopingEntity -> new ResponseEntity<>(ToypetDopingEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/api/toypet/buff/{name}")
    public ResponseEntity<ToypetBuffEntity> getToypetBuffByName(@PathVariable("name") String name) {
        Optional<ToypetBuffEntity> entity = toypetBuffRepository.findByName(name);
        return entity.map(ToypetBuffEntity -> new ResponseEntity<>(ToypetBuffEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/api/toypet/{id}")
    public ResponseEntity<ToypetEntity> getToypetBuffByName(@PathVariable("id") Integer id) {
        Optional<ToypetEntity> entity = toypetRepository.findById(id);

        if (entity.isPresent()) {
            entity.get().setFunction1(toypetFunction(entity.get().getFuncType1(), entity.get().getFuncTypeName1()));
            entity.get().setFunction2(toypetFunction(entity.get().getFuncType2(), entity.get().getFuncTypeName2()));
        }

        return entity.map(ToypetEntity -> new ResponseEntity<>(ToypetEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    private Object toypetFunction (String type, String name) {

        if (type == null) {
            return null;
        }

        switch (type) {
            case "looting":
                return lootingRepository.findByName(name);
            case "feeding":
                return toypetFeedRepository.findByName(name);
            case "doping":
                return toypetDopingRepository.findByName(name);
            case "warehouse":
                return warehouseRepository.findByName(name);
            case "merchant":
                return merchantRepository.findByName(name);
            case "buff":
                return toypetBuffRepository.findByName(name);
            default:
                return null;
        }

    }



}
