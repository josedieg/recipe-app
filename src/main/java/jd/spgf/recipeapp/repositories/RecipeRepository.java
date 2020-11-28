package jd.spgf.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import jd.spgf.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
