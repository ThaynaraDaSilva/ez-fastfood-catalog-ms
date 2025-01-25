package br.com.fiap.ez.fastfood.infrastructure.config;

import br.com.fiap.ez.fastfood.adapters.out.repository.CategoryRepositoryImpl;
import br.com.fiap.ez.fastfood.adapters.out.repository.JpaCategoryRepository;
import br.com.fiap.ez.fastfood.adapters.out.repository.JpaProductRepository;
import br.com.fiap.ez.fastfood.adapters.out.repository.ProductRepositoryImpl;
import br.com.fiap.ez.fastfood.domain.repository.CategoryRepository;
import br.com.fiap.ez.fastfood.domain.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RepositoryConfiguration {

	@Bean
	public ProductRepository productRepository(JpaProductRepository jpaProductRepository) {
		return new ProductRepositoryImpl(jpaProductRepository);
	}

	@Bean
	public CategoryRepository categoryRepository(JpaCategoryRepository jpaCategoryRepository) {
		return new CategoryRepositoryImpl(jpaCategoryRepository);
	}

}
