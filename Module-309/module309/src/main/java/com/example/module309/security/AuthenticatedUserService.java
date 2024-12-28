package com.example.module309.security;

import com.example.module309.database.dao.UserDAO;
import com.example.module309.database.entity.User;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Slf4j
@Component
public class AuthenticatedUserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private AuthenticationManager authenticationManager;


    // in a JSP page we can use a simple tag to get the current username <sec:authentication property="principal.username"/>

    public String getCurrentUsername() {
        SecurityContext context = SecurityContextHolder.getContext();

        if (context != null && context.getAuthentication() != null) {
            if (context.getAuthentication() instanceof AnonymousAuthenticationToken) {
                //not logged in so return null
                return null;
            } else {
                final org.springframework.security.core.userdetails.User principal =
                        (org.springframework.security.core.userdetails.User) context.getAuthentication().getPrincipal();
                return principal.getUsername();
            }
        } else {
            return null;
        }
    }


    // This will be used by almost everyone in the project to get the user_id for the logged in user
// you can simply autowire in the authenticated user service and call this function similar to DAO call
// this function returns null if the user is not logged in and will return a User entity if they are

    public User loadCurrentUser() {
        String username = getCurrentUsername();
        if (username != null) {
            return userDAO.findByEmailIgnoreCase(username);
        }
        return null;
    }

    // this function will manually log a user in after creating a new user
    public void changeLoggedInUsername(HttpSession session, String username, String unencryptedPassword) {
        // reset security principal to be the new user information
        Authentication request = new UsernamePasswordAuthenticationToken(username, unencryptedPassword);
        Authentication result = authenticationManager.authenticate(request);
        SecurityContext sc = SecurityContextHolder.getContext();
        sc.setAuthentication(result);
        session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, sc);
    }

    public boolean isUserInRole(String role) {
        SecurityContext context = SecurityContextHolder.getContext();
        if (context != null && context.getAuthentication() != null) {
            Collection<? extends GrantedAuthority> authorities = context.getAuthentication().getAuthorities();
            for (GrantedAuthority authority : authorities) {
                if (authority.getAuthority().equals(role)) {
                    return true;
                }
            }
        }

        return false;
    }


    public boolean isAuthenticated() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof AnonymousAuthenticationToken) {
            return false;
        }

        return (authentication != null && authentication.isAuthenticated());
    }

}
