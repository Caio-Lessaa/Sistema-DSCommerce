package com.caioLessa.dscommerce.repositories;

import com.caioLessa.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
