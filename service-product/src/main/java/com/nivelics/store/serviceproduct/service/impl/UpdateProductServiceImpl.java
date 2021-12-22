package com.nivelics.store.serviceproduct.service.impl;

import com.nivelics.store.serviceproduct.entity.Product;
import com.nivelics.store.serviceproduct.repository.ProductRepository;
import com.nivelics.store.serviceproduct.service.UpdateProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateProductServiceImpl  implements UpdateProductService  {

    private final ProductRepository productRepository;

    @Autowired
    private GetProductServiceImpl getProductServiceImpl;

    @Override
    public Product updateProduct(Product product) {
        Product productDB = getProductServiceImpl.getProduct(product.getId());
        if(productDB == null)
            return null;
        productDB.setName(product.getName());
        productDB.setDescription(product.getDescription());
        productDB.setCategory(product.getCategory());
        productDB.setPrice(product.getPrice());
        return productRepository.save(productDB);
    }
}
