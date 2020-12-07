package com.myApp.dto;

import com.myApp.entity.Role;
import com.myApp.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserDTO {

    private String firstName;
    private String lastName;
    private String userName;
    private String phoneNumber;
    private boolean enabled;
    private Role role;
    private Gender gender;
    private String password;
    private String confPassword;


}
