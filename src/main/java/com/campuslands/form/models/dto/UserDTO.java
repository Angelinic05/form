package com.campuslands.form.models.dto;

import com.campuslands.form.models.User;

public class UserDTO {
    private String titulo;
    private User user;
    
    public UserDTO() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}