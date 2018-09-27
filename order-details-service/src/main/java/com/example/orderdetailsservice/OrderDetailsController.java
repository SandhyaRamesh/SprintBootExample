package com.example.orderdetailsservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;
import java.util.List;

@RestController

public class OrderDetailsController {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @RequestMapping("/order")
    public List<OrderDetails> orderDetails() throws IOException
        {
            return orderDetailsService.getAllOrderDetails();
        }

        @RequestMapping("/orderById/{id}")
    public List<OrderDetails> getOrderDetailsById(@PathVariable String id) throws IOException
    {
        return orderDetailsService.getOrderDetailsById(id);
    }
}