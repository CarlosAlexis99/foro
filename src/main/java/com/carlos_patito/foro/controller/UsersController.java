package com.carlos_patito.foro.controller;

import com.carlos_patito.foro.controller.dto.UserDTO;
import com.carlos_patito.foro.repository.UserRepository;
import com.carlos_patito.foro.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    private UsersService usersServiceImp;



    @GetMapping
    public ResponseEntity<?> findAll(){
        List<UserDTO> users = usersServiceImp.findAll()
                .stream().map(userEntity -> UserDTO.builder()
                        .username(userEntity.getUsername())
                        .email(userEntity.getEmail())
                        .isEnabled(userEntity.isEnabled()).build()).toList();
        return ResponseEntity.ok(users);
    }

}
