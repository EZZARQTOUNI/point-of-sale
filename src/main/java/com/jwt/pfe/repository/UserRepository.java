package com.jwt.pfe.repository;

import com.jwt.pfe.repository.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User,Long> {
}
