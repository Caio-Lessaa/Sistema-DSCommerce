package com.caioLessa.dscommerce.service;

import com.caioLessa.dscommerce.dto.ProductDTO;
import com.caioLessa.dscommerce.entities.Product;
import com.caioLessa.dscommerce.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado para o ID informado!"));
        return new ProductDTO(product);
    }
}
