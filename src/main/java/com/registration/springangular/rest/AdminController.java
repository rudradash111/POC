package com.registration.springangular.rest;

import com.registration.springangular.domain.Role;
import com.registration.springangular.domain.User;
import com.registration.springangular.dto.USerDto;
import com.registration.springangular.repository.UserRepository;
import com.registration.springangular.service.AssetLiabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Optional;

/*role based secuirity*/
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/registration")
public class AdminController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AssetLiabilityService assetLiabilityService;
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/admin/all")
    public String securedHello() {
        return "Secured Hello";
    }
    /*it only access by whichh have admin role */
//   @PreAuthorize("hasAnyRole('ADMIN')")
    /*first write this functionality before write login functionality*/
    @RequestMapping(value = "/createUser",method = RequestMethod.POST)
    @ResponseBody
    public String createNewRegistration(@RequestBody USerDto uSerDto) throws Exception {
        /*check if same user exist*/
        Optional<User> existingUser=userRepository.findByUserName(uSerDto.getUserName());
        if(existingUser.isPresent()){
            throw new Exception();
        }else{
            String plainText=uSerDto.getPassword();
            String encrypt=assetLiabilityService.passwordEncoder().encode(plainText);

            User user = new User();
            user.setUserName(uSerDto.getUserName());
            user.setEmail(uSerDto.getEmail());
            user.setPassword(encrypt);
            HashSet hashSet= new HashSet();
            Role role= new Role();
            role.setRole(uSerDto.getRole());
            role.setDescription(uSerDto.getPassword());
            hashSet.add(role);
            user.setRoles(hashSet);
            userRepository.save(user);
            return "USer Added successfully";
        }

    }


}
/*
    @PostMapping("/admin/add")
    public String addUserByAdmin(@RequestBody User user) {
        String pwd = user.getPassword();
        String encryptPwd = assetLiabilityService.passwordEncoder(pwd);
        user.setPassword(encryptPwd);
        userRepository.save(user);
        return "user added successfully...";
    }
*/