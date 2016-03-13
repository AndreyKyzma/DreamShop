package com.dreamshop.services.implementation;

import com.dreamshop.model.Orders;
import com.dreamshop.repository.OrdersRepo;
import com.dreamshop.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kyza on 12.03.2016.
 */@Service
public class OrdersImpl implements OrdersService {

    @Autowired
    OrdersRepo ordersRepo;

    @Override
    public List<Orders> getAll() {
        return ordersRepo.findAll();
    }

    @Override
    public Orders addOrders(Orders orders) {
        return ordersRepo.saveAndFlush(orders);
    }

    @Override
    public void deleteOrders(int id) {
        ordersRepo.delete(id);

    }



}
