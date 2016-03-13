package com.dreamshop.services.implementation;


import com.dreamshop.model.CustomersAddresses;
import com.dreamshop.repository.CustAddresRepo;

import com.dreamshop.services.CustAddresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Kyza on 12.03.2016.
 */
@Service
public class CustAddresImpl implements CustAddresService {

    @Autowired
    CustAddresRepo custAddresRepo;


    @Override
    public List<CustomersAddresses> getAll() {
        return custAddresRepo.findAll();
    }

    @Override
    public CustomersAddresses addCustomersAddress(CustomersAddresses customersAddresses) {
        return custAddresRepo.saveAndFlush(customersAddresses);
    }

}
