package com.management.restcontrollers;

import com.management.entities.Ingredient;
import com.management.repositories.IngredientRepository;
import com.management.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class IngredientRestController {
    @Autowired
    IngredientService ingredientService;

    @GetMapping("/ingredients")
    public List<Ingredient> getAllIngredients(){
        return ingredientService.getAllIngredients();
    }

    @GetMapping("/ingredients/{id}")
    public Ingredient getIngredientById(@PathVariable("id") Long id){
        return ingredientService.getIngredientById(id);
    }

    @PostMapping("/ingredients/save")
    public Ingredient saveIngredient(@RequestBody Ingredient ingredient){
        return ingredientService.saveIngredient(ingredient);
    }

    @PutMapping("/ingredients/update")
    public Ingredient updateIngredient(@RequestBody Ingredient ingredient){
        return ingredientService.updateIngredient(ingredient);
    }

    @DeleteMapping("/ingredients/{idIngredient}")
    public void deleteIngredientById(@PathVariable("idIngredient") Long id){
        ingredientService.deleteIngredientById(id);
    }
}
