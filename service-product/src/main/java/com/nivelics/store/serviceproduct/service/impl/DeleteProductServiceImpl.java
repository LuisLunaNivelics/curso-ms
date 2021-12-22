package com.nivelics.store.serviceproduct.service.impl;

import com.nivelics.store.serviceproduct.entity.Product;
import com.nivelics.store.serviceproduct.repository.ProductRepository;
import com.nivelics.store.serviceproduct.service.DeleteProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteProductServiceImpl  implements DeleteProductService {

    private final ProductRepository productRepository;

    @Autowired
    private GetProductServiceImpl getProductServiceImpl;

    @Override
    public Product deleteProduct(Long id) {
        Product productDB = getProductServiceImpl.getProduct(id);
        if(productDB == null)
            return null;
        productDB.setStatus("DELETED");
        return productRepository.save(productDB);
    }
}
