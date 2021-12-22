package com.nivelics.store.serviceproduct.service.impl;

import com.nivelics.store.serviceproduct.entity.Product;
import com.nivelics.store.serviceproduct.repository.ProductRepository;
import com.nivelics.store.serviceproduct.service.GetProductService;
import com.nivelics.store.serviceproduct.service.UpdateStockService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UpdateStockServiceImplTest {

    @Mock
    private ProductRepository productRepository;
    @Mock
    private UpdateStockService updateStockService;
    @Mock
    private GetProductService getProductService;
    @Mock
    private UpdateStockServiceImpl updateStockServiceImpl;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
        updateStockService = new UpdateStockServiceImpl(productRepository);
        Product computer = Product.builder()
                .id(1L)
                .name("computer")
                .price(Double.parseDouble("12.5"))
                .stock(Double.parseDouble("5"))
                .build();

        Mockito.when(productRepository.findById(1L))
                .thenReturn(Optional.of(computer));
        Mockito.when(productRepository.save(computer))
                .thenReturn(computer);

    }

    @Test
    public void whenValidGetId_ThenReturnProduct(){
        Product found = updateStockServiceImpl.getProduct(1L);
        Assertions.assertThat(found.getName()).isEqualTo("computer");
    }
}