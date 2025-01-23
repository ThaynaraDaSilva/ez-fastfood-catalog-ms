package br.com.fiap.ez.fastfood.adapters.out.repository;

import br.com.fiap.ez.fastfood.infrastructure.persistence.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface JpaCategoryRepository  extends JpaRepository<CategoryEntity, Long>{

	
	@Query(nativeQuery = true, value = "SELECT * FROM EZ_FASTFOOD_CATALOG.CATEGOGRY WHERE id = :id")
	CategoryEntity findCategoryById(@Param("id") Long id);
}
