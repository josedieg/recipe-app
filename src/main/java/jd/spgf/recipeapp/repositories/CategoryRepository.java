package jd.spgf.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

import jd.spgf.recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	Optional<Category> findByDescription(String description);
}
