package com.example.ExProva6.user;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserDTO {

    String name;

    String email;

    String password;

}
