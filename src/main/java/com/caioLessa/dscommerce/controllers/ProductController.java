package com.caioLessa.dscommerce.controllers;

import com.caioLessa.dscommerce.dto.ProductDTO;
import com.caioLessa.dscommerce.repositories.ProductRepository;
import com.caioLessa.dscommerce.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        return productService.findById(id); 
    }
}
