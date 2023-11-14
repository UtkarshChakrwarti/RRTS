package com.typhoone.rrts.entity;

import com.typhoone.rrts.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;


    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String password;
    private String mobile;

}
