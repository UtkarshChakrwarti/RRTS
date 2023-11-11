package com.typhoone.rrts.service;

import com.typhoone.rrts.dtos.UsersDTO;
import com.typhoone.rrts.entity.Users;
import com.typhoone.rrts.enums.Role;
import com.typhoone.rrts.repository.UsersRepository;
import com.typhoone.rrts.utility.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    private final UsersRepository usersRepository;

    private final EntityMapper entityMapper;


    @Autowired
    public UserServiceImpl(UsersRepository usersRepository, EntityMapper entityMapper) {
        this.usersRepository = usersRepository;
        this.entityMapper = entityMapper;
    }


    @Override
    public UsersDTO createUser(UsersDTO user) {
        Users users = new Users();
        users.setName(user.getName());
        Role role = Role.valueOf(user.getRole());
        users.setRole(role);
        usersRepository.save(users);

        return entityMapper.toDto(users, UsersDTO.class);

    }

    @Override
    public UsersDTO updateUser(UsersDTO user) {
        Users users = usersRepository.findById(user.getId()).orElseThrow();
        user.setName(user.getName());
        Role role = Role.valueOf(user.getRole());
        users.setRole(role);
        usersRepository.save(users);
        return entityMapper.toDto(users, UsersDTO.class);

    }

    @Override
    public UsersDTO deleteUser(UsersDTO user) {
        Users users = usersRepository.findById(user.getId()).orElseThrow();;
        usersRepository.delete(users);
        return entityMapper.toDto(users, UsersDTO.class);
    }

    @Override
    public UsersDTO getUser(Long id) {
       Users user =  usersRepository.findById(id).orElseThrow();
       return entityMapper.toDto(user, UsersDTO.class);
    }

    @Override
    public UsersDTO getUserByEmail(String email) {
        Users user =  usersRepository.findByEmail(email);
        return entityMapper.toDto(user, UsersDTO.class);
    }

    @Override
    public UsersDTO getUserByMobile(String mobile) {
       Users user =  usersRepository.findByMobile(mobile);
         return entityMapper.toDto(user, UsersDTO.class);
    }

    @Override
    public UsersDTO getUserById(Long id) {
        Users user =  usersRepository.findById(id).orElseThrow();
        return entityMapper.toDto(user, UsersDTO.class);
    }


}
