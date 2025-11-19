package com.animeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animeapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsUserByUsername(String usernmae);

    User findByUsernameAndPassword(String username, String password);

    boolean existsUserById(Integer id);

}
