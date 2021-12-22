package com.nivelics.store.serviceproduct.service;

import com.nivelics.store.serviceproduct.entity.Product;

public interface UpdateStockService {

    public Product updateStock(Long id, Double quantity);

}
