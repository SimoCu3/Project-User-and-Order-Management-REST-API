package com.example.ExProva6.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "email", unique = true, nullable = false)
    String email;

    @Column(nullable = false)
    String password;
}
