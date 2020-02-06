package com.registration.springangular.service;

import com.registration.springangular.dao.CrudDao;
import com.registration.springangular.domain.AssetLiability;
import com.registration.springangular.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private CrudDao crudDao;

    public List<User> findAllUsers(){
        return  crudDao.findAllUsers();
    }

    public List<User> updateUsers(){
        return  new ArrayList<>();
    }

    public void saveNewUsers(User user){
       crudDao.saveNewUser(user);
    }

    public List<User> deleteUsers(){
        return  new ArrayList<>();
    }

    public void deleteuser(String id) {
        crudDao.deleteuser(id);
    }

    public void saveRpaNewUsers(AssetLiability assetLiability) {
    }
}
