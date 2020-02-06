package com.registration.springangular.rest;


import com.registration.springangular.domain.AssetLiability;
//import com.registration.springangular.repository.RpaRepository;
import com.registration.springangular.domain.FdAccount;
import com.registration.springangular.domain.Home;
import com.registration.springangular.domain.LoanAndReferenceType;
import com.registration.springangular.repository.FdAccountRepository;
import com.registration.springangular.repository.LoanAndReferenceRepository;
import com.registration.springangular.repository.RpaRepository;
//import com.registration.springangular.service.USerDetailsServiceImpl;
import com.registration.springangular.service.AssetLiabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
@RequestMapping("/rpa/api/v1")
public class RpaResource {
    @Autowired
private RpaRepository rpaRepository;
//            USerDetailsServiceImpl userService;
    @Autowired
            FdAccountRepository fdAccountRepository;
    @Autowired
    LoanAndReferenceRepository loanAndReferenceRepository;
    @Autowired
    private AssetLiabilityService assetLiabilityService;
    @RequestMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.POST)
    public void saveAllUsers(@RequestBody AssetLiability assetLiability) {
        System.out.println(assetLiability);
        rpaRepository.save(assetLiability);
    }

    @RequestMapping(value = "/getHomeObject", method = RequestMethod.GET)
    public List<Home> getAllUsers(@RequestParam("referenceNumber") String referenceNumber) {
       return assetLiabilityService.getHomeObject(referenceNumber);
        /*RequestParam request url should change
    http://localhost:8888/rpa/api/v1/getHomeObject?referenceNumber=aww
    */
    }
    @RequestMapping(value = "/homeSave", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.POST)
    public void saveHomeData(@RequestBody LoanAndReferenceType loanAndReferenceType) {
        assetLiabilityService.saveAndUpdateHomeObject(loanAndReferenceType);

    }

    @RequestMapping(value = "/getAllReferenceNumber",method = RequestMethod.GET)
    public List<String>getAllReferenceDetail(){
     return    assetLiabilityService.getAllReferenceDetail();

    }

}