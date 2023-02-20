package com.jwt.pfe.repository;

import com.jwt.pfe.repository.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends GenericRepository<Product,Long> {
}
