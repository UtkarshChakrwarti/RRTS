package com.typhoone.rrts.service;

import com.typhoone.rrts.dtos.UsersDTO;


public interface UserService {

    UsersDTO createUser(UsersDTO user);

    UsersDTO updateUser(UsersDTO user);

    UsersDTO deleteUser(UsersDTO user);

    UsersDTO getUser(Long id);

    UsersDTO getUserByEmail(String email);

    UsersDTO getUserByMobile(String mobile);

    UsersDTO getUserById(Long id);

   }
