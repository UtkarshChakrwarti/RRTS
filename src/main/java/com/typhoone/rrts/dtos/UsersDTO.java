package com.typhoone.rrts.dtos;

import lombok.Data;

@Data
public class UsersDTO {
    private Long id;
    private String name;
    private String role;
    private String email;
    private String password;
    private String mobile;
}
