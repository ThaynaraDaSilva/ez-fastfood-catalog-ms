package br.com.fiap.ez.fastfood.adapters.out.repository;

import br.com.fiap.ez.fastfood.infrastructure.persistence.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaProductRepository extends JpaRepository<ProductEntity, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM EZ_FASTFOOD_CATALOG.PRODUCT WHERE id = :id")
	ProductEntity findProductById(@Param("id") Long id);

	@Query(nativeQuery = true, value = "SELECT * FROM EZ_FASTFOOD_CATALOG.PRODUCT WHERE category_id = :id")
	List<ProductEntity> findProductByCategoryId(@Param("id") Long id);
}
