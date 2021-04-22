package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.AppUser;
import com.example.trello_project_alcohol.model.JwtResponse;
import com.example.trello_project_alcohol.service.jwtService.JwtService;
import com.example.trello_project_alcohol.service.userService.IAppUserService;
import com.example.trello_project_alcohol.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private IAppUserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AppUser user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassWord()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtService.generateTokenLogin(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        UserService.currentUser = userService.findByUsername(user.getUserName()).get();
        return ResponseEntity.ok(new JwtResponse(jwt, UserService.currentUser.getId(), userDetails.getUsername(), UserService.currentUser.getEmail(), userDetails.getAuthorities()));
    }

    @GetMapping("/logOut")
    public ResponseEntity<?> admin() {
        UserService.currentUser = null;
        return new ResponseEntity<>(HttpStatus.OK);
    }

}