//package com.registration.springangular.service;
//
//import com.registration.springangular.domain.AssetLiability;
//import com.registration.springangular.domain.USerDetailsImpl;
//import com.registration.springangular.domain.User;
//import com.registration.springangular.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//@Component
//public class USerDetailsServiceImpl implements UserDetailsService {
//@Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        Optional<User> optionalUser=userRepository.findByFirstName(s);
//        optionalUser.orElseThrow(()->new UsernameNotFoundException("user not found"));
//        return optionalUser.map( USerDetailsImpl::new).get();
//
//    }
//
//    public void saveRpaNewUsers (AssetLiability assetLiability){
//       System.out.println(assetLiability);
//    }
//}
