package com.javaguides.course.resources;


import com.javaguides.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1, "daniel", "daniel@gmail.com", "29391239129", "rafael123");
        return ResponseEntity.ok().body(user);
    }
}
