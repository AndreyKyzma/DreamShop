package com.DreamShop.services.implementation;

import com.DreamShop.model.ItemsSKU;
import com.DreamShop.model.Orders;
import com.DreamShop.repository.OrdersRepo;
import com.DreamShop.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
