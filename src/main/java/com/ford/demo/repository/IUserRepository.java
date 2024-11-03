package com.ford.demo.repository;

import com.ford.demo.model.Event;
import com.ford.demo.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {
    int countByEventId(int eventId);
    Optional<User> findByEmail(String email);
	
}
