package com.customers.repository;

import com.customers.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for Customer class*/

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
