package com.example.ExProva6.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUser() {
        return ResponseEntity.ok(userService.getAllUser());
    }

    @GetMapping("{/userId}")
    public ResponseEntity<?> getUserDTOById(@PathVariable("userId") Long userId) {
        UserDTO userFound = userService.getUserDTOById(userId);
        log.debug("User with id {} found",userId);
        return ResponseEntity.status(HttpStatus.FOUND).body(userFound);
    }

    @PatchMapping("{/userId}")
    updateUser


    deleteUser


}
