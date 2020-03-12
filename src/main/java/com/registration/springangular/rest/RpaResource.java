package com.registration.springangular.rest;


import com.registration.springangular.domain.*;
//import com.registration.springangular.repository.RpaRepository;
import com.registration.springangular.dto.Login;
import com.registration.springangular.dto.USerDto;
import com.registration.springangular.repository.RegistrationRepository;
import com.registration.springangular.repository.LoanAndReferenceRepository;
import com.registration.springangular.repository.RpaRepository;
//import com.registration.springangular.service.USerDetailsServiceImpl;
import com.registration.springangular.repository.UserRepository;
import com.registration.springangular.service.AssetLiabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

/*url based security*/
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
@RequestMapping("/rpa/api/v1")
public class RpaResource {
    @Autowired
private RpaRepository rpaRepository;
//            USerDetailsServiceImpl userService;
    @Autowired
    UserRepository userRepository;
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



//if you write below code insted of above code in front end  it always enter into error section at the time of subscription
/*@RequestMapping(value = "/createRegistration",method = RequestMethod.POST,
produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createNewRegistration(@RequestBody Registration registration) {
      boolean isTrue=assetLiabilityService.createRegistration(registration);
      if(isTrue) {
          return new ResponseEntity<>("User already Exist", HttpStatus.BAD_REQUEST);
      }
      else {
          return new ResponseEntity<>("User Created Successfully",HttpStatus.OK);
      }
}*/
    @RequestMapping(value = "/login",method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void login(@RequestBody Login login) throws Exception {
        Optional<User> user = userRepository.findByUserName(login.getUserName());

        if (user.get().getUserName().isEmpty()) {
            throw new Exception();
        }else {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            boolean isTrue= encoder.matches( login.getPassword(),user.get().getPassword());
            if(!isTrue){
               throw new Exception();
            }
        }
    }
}