package com.nivelics.store.serviceproduct.service.impl;

import com.nivelics.store.serviceproduct.entity.Product;
import com.nivelics.store.serviceproduct.repository.ProductRepository;
import com.nivelics.store.serviceproduct.service.ListAllProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListAllProductServiceImpl implements ListAllProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> listAllProduct() {
        return productRepository.findAll();
    }
}
