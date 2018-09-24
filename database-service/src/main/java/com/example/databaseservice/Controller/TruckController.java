package com.example.databaseservice.Controller;


import com.example.databaseservice.Repository.ProductRepository;
import com.example.databaseservice.Repository.TruckRepository;
import com.example.databaseservice.model.ProductModel;
import com.example.databaseservice.model.TruckModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TruckController {

    @Autowired
    private TruckRepository truckRepository;

    @GetMapping("/trucks")
    public Page<TruckModel> getTruck(Pageable pageable) {
        return truckRepository.findAll(pageable);
    }
}
