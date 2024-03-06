package com.example.bigstarcollectible.restcontrollers;

import com.example.bigstarcollectible.beans.Product;
import com.example.bigstarcollectible.dao.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ProductRestController {

    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/bigstar/api/products")
    public List<Product> allProducts(){
        List<Product> products = new ArrayList<>();
        return (List<Product>) productRepository.findAll();
    }
}
