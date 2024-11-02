package com.ford.demo.controller;

import com.ford.demo.model.Event;
import com.ford.demo.model.User;
import com.ford.demo.repository.IEventRepository;
import com.ford.demo.repository.IUserRepository;
import com.ford.demo.service.eventServiceImpl;
import com.ford.demo.service.userServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    userServiceImpl userService;
    @Autowired
    IUserRepository userRepository;
    @Autowired
    eventServiceImpl eventService;
    @PostMapping
    @Transactional
    public ResponseEntity<User> addUser(@Validated @RequestBody User user) {
//        User createdUser = userService.addUser(user);
//        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        try {

            Event event = eventService.getEventById(user.getEvent().getId());

            if (event == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Event not found
            }

            int maxParticipants = event.getMax_part();


            long currentParticipantCount = userService.countUsersByEventId(event.getId());

            if (currentParticipantCount >= maxParticipants) {
                return new ResponseEntity<>(HttpStatus.FORBIDDEN); // 403 Forbidden
            }


            User createdUser = userService.addUser(user);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);

        } catch (IllegalArgumentException e) {
            System.err.println("Error adding user: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            System.err.println("Internal server error: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

  }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        try {
            User user = userService.login(loginRequest.getUsername(), loginRequest.getPassword());
            return ResponseEntity.ok("Login successful");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
    class LoginRequest {
        private String username;
        public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		private String password;

    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        User user = userService.getUserById(id);
        return user != null ? new ResponseEntity<>(user, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
