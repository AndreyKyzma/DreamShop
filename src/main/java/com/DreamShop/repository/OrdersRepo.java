package com.DreamShop.repository;

import com.DreamShop.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by Kyza on 12.03.2016.
 */
public interface OrdersRepo extends JpaRepository<Orders, Integer> {
//@Query()
}
