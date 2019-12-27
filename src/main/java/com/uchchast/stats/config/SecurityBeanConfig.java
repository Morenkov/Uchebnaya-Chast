package com.uchchast.stats.config;

import com.uchchast.stats.repo.UserRepository;
import com.uchchast.stats.service.UserDetailsServiceImpl;
import com.uchchast.stats.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityBeanConfig {

    @Autowired
    public UserRepository userRepository;
    @Autowired
    private UserService userService;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Primary
    @Bean(name = "MyUserDetailsService")
    public UserDetailsService getUserDetailsService(){
        return new UserDetailsServiceImpl(userRepository, userService);
    }
}
