package com.backend.dtos.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDto {

    private String password;
    private String username;
    private String firstName;
    private String email;
    private String lastName;
    private String dateOfBirth;

}
