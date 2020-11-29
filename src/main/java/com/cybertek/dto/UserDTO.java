package com.cybertek.dto;

import com.cybertek.entity.Role;
import com.cybertek.enums.Gender;
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
