package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

public interface CustomerRepository {
  List<Customer> findAll();
}
