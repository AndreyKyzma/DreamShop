package com.DreamShop.repository;

import com.DreamShop.model.CustomersAddresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Kyza on 10.03.2016.
 */

public interface CustAddresRepo extends JpaRepository<CustomersAddresses, Integer> {


}
