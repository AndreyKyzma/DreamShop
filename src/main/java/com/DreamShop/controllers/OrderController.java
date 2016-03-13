package com.DreamShop.controllers;

import com.DreamShop.model.ItemsSKU;
import com.DreamShop.model.Orders;
import com.DreamShop.repository.OrdersRepo;
import com.DreamShop.services.implementation.CustomersImpl;
import com.DreamShop.services.implementation.OrdersImpl;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Kyza on 12.03.2016.
 */
@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Resource
    private OrdersImpl orders;

    @Resource
    private OrdersRepo ordersRepo;

    @Resource
    private CustomersImpl customers;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Orders>> getAllOrders(){
        Iterable<Orders> allOrders = orders.getAll();
        return new ResponseEntity<>(allOrders, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Orders> getSingleOrder(@PathVariable("id") Integer id){
        Orders orders = ordersRepo.findOne(id);
        if(orders != null){
            return new ResponseEntity<>(orders, HttpStatus.OK);
        }
        return new ResponseEntity<>(orders, HttpStatus.NOT_FOUND);

    }
    @RequestMapping(value = "/add", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Orders>> saveOrder(@RequestBody List<Orders> ordersSave){
       Iterable<Orders> saveOrder = ordersRepo.save(ordersSave);
        return new ResponseEntity<>(saveOrder, HttpStatus.OK);
    }

//    @RequestMapping(value = "/{item}")

}
