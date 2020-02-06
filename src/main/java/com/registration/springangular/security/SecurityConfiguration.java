//package com.registration.springangular.security;
//
//import com.registration.springangular.repository.UserRepository;
//import com.registration.springangular.service.USerDetailsServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableWebSecurity
//
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//@Autowired
//    private USerDetailsServiceImpl userDetailsService;
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    //used for login to check user
//
//@Override
//    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//
////        authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//        authenticationManagerBuilder.inMemoryAuthentication()
//                .withUser("admin").password(passwordEncoder().encode("admin12")).roles("ADMIN")
//                .and()
//                .withUser("user").password(passwordEncoder().encode("user123")).roles("USER")
//                .and()
//                .withUser("manager").password(passwordEncoder().encode("manager123")).roles("MANAGER");
//
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//         http.csrf().disable();
//         http.cors();
//        http.authorizeRequests()
//
//                .antMatchers("/api/v1/getAllUser").hasRole("USER")
//                .antMatchers("/api/v1/saveAllUser").hasRole("ADMIN")
//                .antMatchers("/api/v1/home").hasRole("ADMIN")
//                 .and()
//                 .httpBasic();
//    }
//
//}
