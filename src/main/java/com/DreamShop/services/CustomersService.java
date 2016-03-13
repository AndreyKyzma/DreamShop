package com.dreamshop.services;

import com.dreamshop.model.Customers;

import java.util.List;

/**
 * Created by Kyza on 12.03.2016.
 */
public interface CustomersService {
    List<Customers> getAll();
    Customers addCustomers(Customers customers);

}
