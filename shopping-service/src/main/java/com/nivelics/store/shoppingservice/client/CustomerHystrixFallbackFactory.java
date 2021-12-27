package com.nivelics.store.shoppingservice.client;

import com.nivelics.store.shoppingservice.model.Customer;
import org.springframework.http.ResponseEntity;

public class CustomerHystrixFallbackFactory implements CustomerClient{
    @Override
    public ResponseEntity<Customer> getCustomer(long id) {
        Customer customer = Customer.builder()
                .firstName("none")
                .lastName("none")
                .email("none")
                .photoUrl("none").build();
        return ResponseEntity.ok(customer);
    }
}
