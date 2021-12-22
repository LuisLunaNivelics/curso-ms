package com.nivelics.store.serviceproduct.service;

import com.nivelics.store.serviceproduct.entity.Category;
import com.nivelics.store.serviceproduct.entity.Product;

import java.util.List;

public interface FindByCategoryService {

    public List<Product> findByCategory(Category category);

}
