package com.example.ExProva6.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserDTO> getAllUser() {
        List<User> userList = userRepository.findAll();

        return userList.stream().map(user -> userMapper.toDTO(user)).toList();

    }

    public UserDTO getUserDTOById(Long userId) throws NoSuchElementException {
        User userFound = userRepository.findById(userId)
                .orElseThrow(() ->new NoSuchElementException("User with id " + userId + "not found"));
        return userMapper.toDTO(userFound);
    }



}
