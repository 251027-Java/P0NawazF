package com.animeapp.service;

import com.animeapp.exceptions.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.animeapp.model.User;
import com.animeapp.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(String username, String password) throws UserException{
        if (username.isBlank() || password.isBlank() || password.length() < 8) {
            throw new UserException("Incorrect username or password.");
        }
        return userRepository.save(new User(username, password));
    }

    public boolean doesUsernameExist(String username) {
        return userRepository.existsUserByUsername(username);
    }

    public User loginUser(User user) throws UserException{
        String username = user.getUsername();
        String password = user.getPassword();

        User loggedInUser = userRepository.findByUsernameAndPassword(username, password);

        return loggedInUser;
    }

}
