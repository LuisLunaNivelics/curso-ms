package com.nivelics.store.customerservice.repository;

import com.nivelics.store.customerservice.entity.Customer;
import com.nivelics.store.customerservice.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public Customer findByNumberID(String numberID);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByRegion(Region region);
}
