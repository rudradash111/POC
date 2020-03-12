package com.registration.springangular.service;

import com.registration.springangular.domain.AssetLiability;
import com.registration.springangular.domain.USerDetailsImpl;
import com.registration.springangular.domain.User;
import com.registration.springangular.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;
/*The UserDetailsService interface is used to retrieve user-related data.
It has one method named loadUserByUsername() which can be overridden to customize
the process of finding the user.*/
@Service
public class USerDetailsServiceImpl implements UserDetailsService {
@Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        USerDetailsImpl newUserDetails= null;
        Optional<User> optionalUser=userRepository.findByUserName(s);
        if (optionalUser.isPresent()) {
            User userDetails= optionalUser.get();
            newUserDetails = new USerDetailsImpl();
            newUserDetails.setUser(userDetails);
        } else {
            throw new UsernameNotFoundException("User not exist with name : " + s);
        }
        return newUserDetails;
    }

    public void saveRpaNewUsers (AssetLiability assetLiability){
       System.out.println(assetLiability);
    }
}
