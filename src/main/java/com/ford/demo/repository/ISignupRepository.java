package com.ford.demo.repository;

import com.ford.demo.model.Signup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISignupRepository extends JpaRepository<Signup, Integer> {
    // Additional query methods if needed
}
