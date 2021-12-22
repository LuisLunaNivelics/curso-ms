package com.nivelics.store.serviceproduct.service.impl;

import com.nivelics.store.serviceproduct.entity.Product;
import com.nivelics.store.serviceproduct.repository.ProductRepository;
import com.nivelics.store.serviceproduct.service.GetProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetProductServiceImpl implements GetProductService {

    @Autowired
    private  ProductRepository productRepository;

    @Override
    public Product getProduct(Long id) {
        return productRepository.getById(id);
    }
}
