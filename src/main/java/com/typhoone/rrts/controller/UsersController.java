package com.typhoone.rrts.controller;

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

    //deleteUser
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public ResponseEntity<UsersDTO> deleteUser(@RequestBody UsersDTO user) {
        return ResponseEntity.ok(userService.deleteUser(user));
    }

    //getAllUser with pagination

    //getUserById
    @RequestMapping(value = "/getUserById", method = RequestMethod.POST)
    public ResponseEntity<UsersDTO> getUserById(@RequestParam Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    //getUserByEmail
    @RequestMapping(value = "/getUserByEmail", method = RequestMethod.POST)
    public ResponseEntity<UsersDTO> getUserByEmail(@RequestParam String email) {
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }

    //getUserByMobile
    @RequestMapping(value = "/getUserByMobile", method = RequestMethod.POST)
    public ResponseEntity<UsersDTO> getUserByMobile(@RequestParam String mobile) {
        return ResponseEntity.ok(userService.getUserByMobile(mobile));
    }


}
