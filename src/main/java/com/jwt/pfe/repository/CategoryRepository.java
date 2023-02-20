package com.jwt.pfe.repository;


import com.jwt.pfe.repository.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends GenericRepository<Category,Long> {
}
