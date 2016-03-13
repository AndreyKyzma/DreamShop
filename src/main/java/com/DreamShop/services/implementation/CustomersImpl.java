package com.dreamshop.services.implementation;

import com.dreamshop.model.Customers;
import com.dreamshop.repository.CustomersRepository;
import com.dreamshop.services.CustomersService;
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
