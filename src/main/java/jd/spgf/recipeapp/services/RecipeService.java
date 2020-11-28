package jd.spgf.recipeapp.services;

import java.util.Set;

import jd.spgf.recipeapp.domain.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
}
