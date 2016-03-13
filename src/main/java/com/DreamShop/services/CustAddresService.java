package com.dreamshop.services;

import com.dreamshop.model.CustomersAddresses;

import java.util.List;

/**
 * Created by Kyza on 12.03.2016.
 */
public interface CustAddresService {
    List<CustomersAddresses> getAll();
    CustomersAddresses addCustomersAddress(CustomersAddresses customersAddresses);

}
