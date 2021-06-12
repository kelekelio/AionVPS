package pl.aionpb.aion.familiars.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.aionpb.aion.familiars.entity.FamiliarEntity;
import pl.aionpb.aion.familiars.repository.FamiliarRepository;
import pl.aionpb.aion.items.api.ItemApiController;

import java.util.List;
import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */

@RestController
public class FamiliarsApiController {


    @Autowired
    FamiliarRepository familiarRepository;

    @GetMapping("/api/familiar/{id}")
    public ResponseEntity<FamiliarEntity> getFamiliarById(@PathVariable("id") Integer id) {

        Optional<FamiliarEntity> familiarEntity = familiarRepository.findById(id);

        return familiarEntity.map(FamiliarEntity -> new ResponseEntity<>(FamiliarEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }


    @GetMapping("/api/familiar/{column}/{value}")
    public List<FamiliarEntity> getFamiliarsByColumnAndValue(@PathVariable("column") String column, @PathVariable("value") String value) {

        return familiarRepository.findAll(ItemApiController.byColumnNameAndValue(column, value));


    }


}