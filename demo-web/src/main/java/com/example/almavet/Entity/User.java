package com.example.almavet.Entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_id")
    private int idUser;

    @Column(name = "usu_nombre")
    private String name;

    @Column(name = "usu_apellido")
    private String address;

    @Column(name = "usu_username")
    private String username;

    @Column(name = "usu_password")
    private String password;
}
