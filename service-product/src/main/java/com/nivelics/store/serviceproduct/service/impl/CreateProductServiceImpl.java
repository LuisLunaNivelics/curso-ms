package com.nivelics.store.serviceproduct.service.impl;

import com.nivelics.store.serviceproduct.entity.Product;
import com.nivelics.store.serviceproduct.repository.ProductRepository;
import com.nivelics.store.serviceproduct.service.CreateProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class CreateProductServiceImpl implements CreateProductService {

    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        product.setStatus("CREATED");
        product.setCreateAt(new Date());
        return productRepository.save(product);
    }
}
