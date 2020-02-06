//package com.registration.springangular.rest;
//
//import com.registration.springangular.dao.CrudDao;
//import com.registration.springangular.domain.User;
//import com.registration.springangular.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import com.registration.springangular.service.UserService;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@RequestMapping("/api/v1")
//@RestController
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
//public class CrudController {
//
//
//    @Autowired
//    private CrudDao crudDao;
//    @RequestMapping(value="/login",method = RequestMethod.GET)
//    public String Login(){
//return "login";
//    }
//    @RequestMapping(value="/home",method = RequestMethod.GET)
//    public String Home(){
//        return "home";
//    }
//    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
//
//        public String listAllUsers() {
//        return "getAllUser";
//
//
//    }
//    @GetMapping("/secured/alternate")
//    public String alternate() {
//        return "alternate";
//    }
//
//
//    @RequestMapping(value = "/saveAllUser", method = RequestMethod.GET)
//
//    public String saveAllUsers() {
//        return "saveAllUser";
//
//
//    }
//
//
//
//
//}
