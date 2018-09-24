package com.example.databaseservice.Controller;


import com.example.databaseservice.Repository.ProductRepository;
import com.example.databaseservice.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public Page<ProductModel> getQuestions(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
}
