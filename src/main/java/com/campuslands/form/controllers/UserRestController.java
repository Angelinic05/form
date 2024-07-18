package com.campuslands.form.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.campuslands.form.models.User;
import com.campuslands.form.models.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @GetMapping("/index")
    public UserDTO index(){
        UserDTO  dto = new UserDTO();
        User user = new User("Angeli","Corredor");
        dto.setTitulo("Camper");
        dto.setUser(user);
        return dto;
    }

    @PostMapping("/create-user")
    public String createUser(@RequestBody User user) {
        System.out.println("Nuevo usuario recibido: " + user.getNombre() + " " + user.getApellido());
        return "Usuario creado exitosamente";
    }

    @GetMapping("/list-index")
    public List<User> listIndex() {
        User user = new User("Angeli", "Corredor");
        
        List<User> listUsers = new ArrayList<>();
        listUsers.add(user);

        return listUsers;
    }

}