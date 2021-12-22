package com.nivelics.store.serviceproduct.service.impl;

import com.nivelics.store.serviceproduct.entity.Product;
import com.nivelics.store.serviceproduct.repository.ProductRepository;
import com.nivelics.store.serviceproduct.service.UpdateStockService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateStockServiceImpl extends GetProductServiceImpl implements UpdateStockService {

    private final ProductRepository productRepository;

    @Override
    public Product updateStock(Long id, Double quantity) {
        Product productDB = getProduct(id);
        if(productDB == null)
            return null;
        Double stock = productDB.getStock() + quantity;
        productDB.setStock(stock);
        return productRepository.save(productDB);
    }
}
