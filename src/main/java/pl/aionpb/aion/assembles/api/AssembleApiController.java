package pl.aionpb.aion.assembles.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.aionpb.aion.assembles.entity.AssembleEntity;
import pl.aionpb.aion.assembles.entity.AssemblePartsEntity;
import pl.aionpb.aion.assembles.repository.AssemblePartsRepository;
import pl.aionpb.aion.assembles.repository.AssembleRepository;
import pl.aionpb.aion.items.api.ItemApiController;

import java.util.List;
import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@RestController
public class AssembleApiController {

    @Autowired
    private AssembleRepository assembleRepository;

    @Autowired
    private AssemblePartsRepository assemblePartsRepository;


    @GetMapping("/api/assemble/{name}")
    public ResponseEntity<AssembleEntity> getAssembleByName(@PathVariable("name") String name) {

        Optional<AssembleEntity> assembleEntity = assembleRepository.findByName(name);
        //assembleEntity.ifPresent(assembleEntity1 -> assembleEntity.get().setAssembleParts(assemblePartsRepository.findAllByName(name)));

        return assembleEntity.map(AssembleEntity -> new ResponseEntity<>(AssembleEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @GetMapping("/api/assemble/{column}/{value}")
    public List<AssembleEntity> getAssembleByColumnAndValue(@PathVariable("column") String column, @PathVariable("value") String value) {

        return assembleRepository.findAll(ItemApiController.byColumnNameAndValue(column, value));


    }


    @GetMapping("/api/assembleParts/{column}/{name}")
    public List<AssemblePartsEntity> getAssemblePartsByName(@PathVariable("column") String column, @PathVariable("name") String name) {

        switch (column){
            case "partItem":
                return assemblePartsRepository.findAllByPartItem(name);
            default:
                return assemblePartsRepository.findAllByName(name);
        }


    }


}