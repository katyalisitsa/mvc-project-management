package com.cybertek.entity;

import com.cybertek.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity{
    private String firstName;
    private String lastName;
    private String userName;
    private String phoneNumber;
    private boolean enabled;
    private Role role;
    private Gender gender;
    private String password;
    private String confPassword;


    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateDateTime,
                Long lastUpdateUserId, String firstName, String lastName, String userName, String phoneNumber,
                boolean enabled, Role role, Gender gender, String password, String confPassword) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.enabled = enabled;
        this.role = role;
        this.gender = gender;
        this.password = password;
        this.confPassword = confPassword;
    }
}
