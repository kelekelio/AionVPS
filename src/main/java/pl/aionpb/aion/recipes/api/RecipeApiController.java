package pl.aionpb.aion.recipes.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.aionpb.aion.recipes.entity.RecipeEntity;
import pl.aionpb.aion.recipes.repository.RecipeRepository;

import java.util.Optional;

/**
 * @author Grzegorz Nowakowski
 */
@RestController
public class RecipeApiController {


    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping("/api/recipe/{name}")
    public ResponseEntity<RecipeEntity> getRecipeByName(@PathVariable("name") String name) {

        Optional<RecipeEntity> recipeEntity = recipeRepository.findByName(name);

        return recipeEntity.map(RecipeEntity -> new ResponseEntity<>(RecipeEntity, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    /*
    @GetMapping("/api/recipe/{column}/{value}")
    public List<RecipeEntity> getRecipeByColumnAndValue(@PathVariable("column") String column, @PathVariable("value") String value) {

        return recipeRepository.findAll(ItemApiController.byColumnNameAndValue(column, value));


    }
     */



}
