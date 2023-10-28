package com.example.usermanagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    @NotEmpty(message = "User's first name should not be empty or null")
    private String firstName;
    @NotEmpty(message = "User's last name should not be empty or null")
    private String lastName;
    @NotEmpty(message = "User's email should not be empty or null")
    @Email(message = "User email is invalid")
    private String email;
}
