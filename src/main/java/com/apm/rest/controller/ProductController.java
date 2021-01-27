package com.apm.rest.controller;

import com.apm.rest.model.Product;
import com.apm.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/product")
    Iterable<Product> read(){
        return productService.findAll();
    }

    @PostMapping("/product")
    Product create(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping("/product")
    Product update(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/product/{id}")
    void delete(@PathVariable Integer id){
        productService.deleteById(id);
    }

}
