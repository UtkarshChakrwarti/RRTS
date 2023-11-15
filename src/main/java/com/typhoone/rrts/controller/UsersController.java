package com.typhoone.rrts.controller;

import com.typhoone.rrts.dtos.CredentialsDTO;
import com.typhoone.rrts.dtos.UsersDTO;
import com.typhoone.rrts.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@CrossOrigin
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    //login
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<UsersDTO> login(@RequestBody CredentialsDTO credentials) {
        if (credentials.getEmail() == null || credentials.getPassword() == null) {
            return ResponseEntity.badRequest().build();
        }
        if (userService.login(credentials) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userService.login(credentials));
    }


    //createUser
    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public ResponseEntity<UsersDTO> createUser(@RequestBody UsersDTO user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    //updateUser
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public ResponseEntity<UsersDTO> updateUser(@RequestBody UsersDTO user) {
        return ResponseEntity.ok(userService.updateUser(user));
    }

    //deleteUserbyId
    @RequestMapping(value = "/deleteUserById", method = RequestMethod.POST)
    public ResponseEntity<UsersDTO> deleteUser(@RequestParam long id) {
        return ResponseEntity.ok(userService.deleteUserById(id));
    }

    //getAllUsers
    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public ResponseEntity<Iterable<UsersDTO>> getAllUsers() {
        if (userService.getAllUsers() == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userService.getAllUsers());
    }

    //getUserById
    @RequestMapping(value = "/getUserById", method = RequestMethod.POST)
    public ResponseEntity<UsersDTO> getUserById(@RequestParam Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }
        if (userService.getUserById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userService.getUserById(id));
    }

    //getUserByEmail
    @RequestMapping(value = "/getUserByEmail", method = RequestMethod.POST)
    public ResponseEntity<UsersDTO> getUserByEmail(@RequestParam String email) {
        if (email == null) {
            return ResponseEntity.badRequest().build();
        }
        if (userService.getUserByEmail(email) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }

    //getUserByMobile
    @RequestMapping(value = "/getUserByMobile", method = RequestMethod.POST)
    public ResponseEntity<UsersDTO> getUserByMobile(@RequestParam String mobile) {
        if (mobile == null) {
            System.out.println("mobile is null");
            return ResponseEntity.badRequest().build();

        }
        if (userService.getUserByMobile(mobile) == null) {
            System.out.println("mobile is not found");
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userService.getUserByMobile(mobile));
    }


}
