package com.typhoone.rrts.repository;

import com.typhoone.rrts.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByEmail(String email);

    Users findByMobile(String mobile);

    Users findById(long id);

    Users findByEmailAndPassword(String email, String password);
}
