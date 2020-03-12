package com.registration.springangular.security;

//import com.registration.springangular.repository.UserRepository;
//import com.registration.springangular.service.USerDetailsServiceImpl;
import com.registration.springangular.service.AssetLiabilityService;
import com.registration.springangular.service.USerDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
// it an interface we need to implement for our own authorisation pupose
    /*The UserDetailsService interface is used to retrieve user-related data.
     It has one method named loadUserByUsername()
    which can be overridden to customize the process of finding the user.*/
@Autowired
   private UserDetailsService userDetailsService;
@Autowired
    AssetLiabilityService assetLiabilityService;

//define for differetn type of user(admin,user...) authorities


    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
/*UserDetailsService is an interface   used for customize authentication it provided by spring security with database*/
//              authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(assetLiabilityService.passwordEncoder())
//                .withUser("admin").password(assetLiabilityService.passwordEncoder().encode("admin12")).roles("ADMIN")
//                .and()
//                .withUser("user").password(assetLiabilityService.passwordEncoder().encode("user123")).roles("USER")
//                .and()
//                .withUser("manager").password(assetLiabilityService.passwordEncoder().encode("manager123")).roles("MANAGER");
authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(assetLiabilityService.passwordEncoder());
    }
/*this function is used to call from external service .if u will not write u are unabel to acess any of url inside this application
* this method exicuted first before acess any url*/
//define for differet type of user
    //different URLs with required Access Roles.
    @Override
    protected void configure(HttpSecurity http) throws Exception {
/*Cross-Site Request Forgery (CSRF) is an attack that forces an end user to execute unwanted actions on a web application in which they're currently authenticated*/
         http.csrf().disable();
         /*cross-Origin Resource Sharing (CORS) is a mechanism that enables applications hosted on two different domains to share resources*/
         http.cors();
//        http.authorizeRequests()
//                .anyRequest()
//                .authenticated()
//           .antMatchers("**/rpa/api/v1/login**").hasRole("USER")
////                .antMatchers("/api/v1/saveAllUser").hasRole("ADMIN")
////                .antMatchers("/api/v1/home").hasRole("ADMIN")
//                 .and()
//                 .httpBasic();

        http.authorizeRequests().antMatchers("/rpa/api/v1/**", "/registration/createUser/**")
                .permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }
/*formloginis used when u used spring inbuilt ui*/
}
