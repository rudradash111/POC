package com.registration.springangular.repository;

import com.registration.springangular.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {


    Optional<User> findByUserName(String s);
}
