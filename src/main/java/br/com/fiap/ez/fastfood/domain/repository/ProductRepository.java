package br.com.fiap.ez.fastfood.domain.repository;

import br.com.fiap.ez.fastfood.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

	Product save(Product product);
    Product update(Product product);
    Optional<Product> findById(Long id);
    Product findProductById(Long id);
    List<Product> findAll();
    void deleteById(Long id);
    boolean existsById(Long id);
    List<Product> findProductByCategoryId(Long id);
    boolean isProductAssociatedWithOrderItems(Long id);
}