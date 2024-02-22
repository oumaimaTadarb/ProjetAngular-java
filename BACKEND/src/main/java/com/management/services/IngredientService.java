package com.management.services;

import com.management.entities.Ingredient;
import com.management.entities.Plat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IngredientService {
    Ingredient saveIngredient(Ingredient ingredient);
    Ingredient updateIngredient(Ingredient ingredient);
    Ingredient getIngredientById(Long id);
    List<Ingredient> getAllIngredients();
    void deleteIngredientById(Long id);
}
