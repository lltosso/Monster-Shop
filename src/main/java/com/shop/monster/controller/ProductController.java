package com.shop.monster.controller;


import com.shop.monster.service.ProductService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService monsterService) {
        this.productService = monsterService;
    }
}
