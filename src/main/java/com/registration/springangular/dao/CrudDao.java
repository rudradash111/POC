package com.registration.springangular.dao;

import com.registration.springangular.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CrudDao {
    private JdbcTemplate jdbcTemplate;
    private final String  fetchQuery="select * from user";
     final String sql = "insert into User (id,firstName, LastName, email,password) " +
            " VALUES (?, ?, ?,?,?)";
     final String newUSer="INSERT INTO User (id,firstName, LastName, email,password,rePassword) VALUES (?, ?,?, ?,?, ?)";
    @Autowired
    public CrudDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;

    }

    public List<User> findAllUsers(){
       return jdbcTemplate.query(fetchQuery,  new UserRowMapper());

    }

    public void saveNewUser(User user) {

        jdbcTemplate.update(sql, user.getId(), user.getFirstName(),
                user.getLastName(), user.getEmail(),user.getPassword());
    }

    public void deleteuser(String id) {
        jdbcTemplate.update("DELETE FROM User WHERE id = ?",id);
    }

    public int createUser(User user) {
       return jdbcTemplate.update(
                newUSer,
                user.getId(),user.getFirstName(),user.getLastName(), user.getEmail(),user.getPassword(),null
        );
    }
}
