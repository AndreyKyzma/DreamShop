package com.DreamShop.services.implementation;

import com.DreamShop.model.Customers;
import com.DreamShop.model.Orders;
import com.DreamShop.repository.CustomersRepository;
import com.DreamShop.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kyza on 12.03.2016.
 */
@Service
public class CustomersImpl implements CustomersService {

    @Autowired
    CustomersRepository customersRepository;


    @Override
    public List<Customers> getAll() {
        return customersRepository.findAll();
    }

    @Override
    public Customers addCustomers(Customers customers) {
        return customersRepository.saveAndFlush(customers);
    }


}
