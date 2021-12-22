package com.nivelics.store.serviceproduct.repository;

import com.nivelics.store.serviceproduct.entity.Category;
import com.nivelics.store.serviceproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}
