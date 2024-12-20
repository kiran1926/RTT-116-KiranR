package com.example.module309.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {

    //read about Builder Pattern
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        //nonce -read about it
        // you guys can research this if you want .. its for preventing automated bots and helps to increase the likelihood that its a human using your site
        http.csrf(csrf -> csrf.disable());

        // 1) All URLS are considered open and we restrict the URLS we want -- this is better for our use
        // 2) All URLS are restricted and we open the ones we want

        // this part of the configuration secures acutal URLS
        // this is the list of URLS that require authentication to the website befroe the user can view the URL
        // this works on the idea .. that all URLS are accessable to everyone excpt for the ones listed here

//        http.authorizeRequests()
//                .requestMatchers(
//                        new AntPathRequestMatcher("/customer/**"),
//                        new AntPathRequestMatcher("/employee/**")).authenticated()
//                .anyRequest().permitAll();

        http.authorizeHttpRequests((authorize) -> authorize
                        // Require authentication for /customer/** endpoints
                        .requestMatchers("/customer/**").authenticated()
                        .requestMatchers("/employee/**").authenticated()
                        // Allow all other requests without authentication
                        .anyRequest().permitAll()
                );

        // this section specifies where our login page is
        http.formLogin(formLogin -> formLogin
                // this is the URL for the login page ... this needs a controller method to listen and show the login page
                // this is analogous to /customer and the page is login
                .loginPage("/login/login")
                // spring security has this controller method created for us already .. and we are just configuring the URL where it submits to
                .loginProcessingUrl("/login/loginSubmit"));

        // this section is for configuring logout
        http.logout(formLogout -> formLogout
                // when the user logs out ... destroy the session the server side
                .invalidateHttpSession(true)
                // this is the acutal URL this is implemented by spring security and we are just specifying the get mapping for it
                .logoutUrl("/login/logout")
                // where does the user go after they have been logged out
                // this is a URL that we have implemented somewhere in our project or controllers
                .logoutSuccessUrl("/")
                // extra security and delete these cookies when logging out
                .deleteCookies("username", "JSESSIONID"));


        return http.build();
    }

    @Bean(name = "passwordEncoder")
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}