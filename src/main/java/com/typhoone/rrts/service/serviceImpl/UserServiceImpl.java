package com.typhoone.rrts.service.serviceImpl;

import com.typhoone.rrts.dtos.CredentialsDTO;
import com.typhoone.rrts.dtos.UsersDTO;
import com.typhoone.rrts.entity.Users;
import com.typhoone.rrts.enums.Role;
import com.typhoone.rrts.repository.UsersRepository;
import com.typhoone.rrts.service.UserService;
import com.typhoone.rrts.utility.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
        return getUsersDTO(user, users);

    }

    @Override
    public UsersDTO updateUser(UsersDTO user) {
        Users users = usersRepository.findById(user.getId()).orElseThrow();
        return getUsersDTO(user, users);

    }

    private UsersDTO getUsersDTO(UsersDTO user, Users users) {
        users.setName(user.getName());
        Role role = Role.valueOf(user.getRole());
        users.setRole(role);
        users.setEmail(user.getEmail());
        users.setPassword(user.getPassword());
        users.setMobile(user.getMobile());

        usersRepository.save(users);
        return entityMapper.toDto(users, UsersDTO.class);
    }

    @Override
    public UsersDTO getUserByEmail(String email) {
        try {
            Users user = usersRepository.findByEmail(email);
            return entityMapper.toDto(user, UsersDTO.class);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public UsersDTO getUserByMobile(String mobile) {
        try {
            Users user = usersRepository.findByMobile(mobile);
            return entityMapper.toDto(user, UsersDTO.class);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public UsersDTO getUserById(Long id) {
        //using try catch block
        try {
            Users user = usersRepository.findById(id).orElseThrow();
            return entityMapper.toDto(user, UsersDTO.class);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public UsersDTO deleteUserById(long id) {
        try {
            Users user = usersRepository.findById(id);
            usersRepository.delete(user);
            return entityMapper.toDto(user, UsersDTO.class);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Iterable<UsersDTO> getAllUsers() {
        try {
            Iterable<Users> users = usersRepository.findAll();
            ArrayList<UsersDTO> usersDTO = new ArrayList<>();
            for (Users user : users) {
                usersDTO.add(entityMapper.toDto(user, UsersDTO.class));
            }
            return usersDTO;
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public UsersDTO login(CredentialsDTO credentials) {
        try {
            Users user = usersRepository.findByEmailAndPassword(credentials.getEmail(), credentials.getPassword());
            return entityMapper.toDto(user, UsersDTO.class);
        } catch (Exception e) {
            return null;
        }

    }


}
