package com.dreamshop.repository;

import com.dreamshop.model.CustomersAddresses;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kyza on 10.03.2016.
 */

public interface CustAddresRepo extends JpaRepository<CustomersAddresses, Integer> {


}
