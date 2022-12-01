package com.glfasshonstore.glfasshoncatalogueservice.controller;

import com.glfasshonstore.glfasshoncatalogueservice.dto.Product;
import com.glfasshonstore.glfasshoncatalogueservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogue")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @GetMapping("/test")
    public String test(){
        return "hello";
    }
    @PostMapping("/products")
    public int saveProducts(@RequestBody List<Product> products) {
        System.out.println(products.toString());
        repository.saveAll(products);
        return products.size();
    }

    @GetMapping("/find/all")
    public Iterable<Product> findAllProducts() {
        return repository.findAll();
    }

    @GetMapping("/find/{category}")
    public List<Product> findByCategory(@PathVariable String category) {
        return repository.findByCategory(category);
    }


}
