package com.typhoone.rrts.service;

import com.typhoone.rrts.dtos.CredentialsDTO;
import com.typhoone.rrts.dtos.UsersDTO;


public interface UserService {

    UsersDTO createUser(UsersDTO user);

    UsersDTO updateUser(UsersDTO user);

    UsersDTO getUserByEmail(String email);

    UsersDTO getUserByMobile(String mobile);

    UsersDTO getUserById(Long id);

    UsersDTO deleteUserById(long id);

    Iterable<UsersDTO> getAllUsers();

    UsersDTO login(CredentialsDTO credentials);

}
