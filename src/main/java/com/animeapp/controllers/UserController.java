package com.animeapp.controllers;

import com.animeapp.exceptions.UserException;
import com.animeapp.model.ErrorResponse;
import com.animeapp.model.User;
import com.animeapp.service.AnimeService;
import com.animeapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    ResponseEntity<?> registerUser(@RequestBody User request) {
        if (userService.doesUsernameExist(request.getUsername())) {
            return ResponseEntity.status(409).body(request);
        }
        try{
            User registeredUser = userService.registerUser(request.getUsername(), request.getPassword());
            return ResponseEntity.ok(registeredUser);
        }
        catch (UserException e){
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage());
            return ResponseEntity.badRequest().body(errorResponse);
        }

    }

    @PostMapping("/login")
    ResponseEntity<?> login(@RequestBody User request) {
        try{
            User loggedInAccount = userService.loginUser(request);

            if (Objects.isNull(loggedInAccount)) {
                return ResponseEntity.status(401).body(null);
            }

            return ResponseEntity.ok(loggedInAccount);
        }
        catch (UserException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
