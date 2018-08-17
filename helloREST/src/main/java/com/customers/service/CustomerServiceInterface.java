package com.customers.service;

import com.customers.model.Customer;

import java.util.List;

public interface CustomerServiceInterface {

    Customer getById(Integer id);

    void save (Customer customer);

    void delete (Integer id);

    List<Customer> getAll();
}
