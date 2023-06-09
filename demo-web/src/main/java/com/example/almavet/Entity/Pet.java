package com.example.almavet.Entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "mascota")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "masc_id")
    private int idPet;

    @Column(name = "clie_id")
    private int idClient;
    @Column(name = "masc_nombre")
    private String name;
    @Column(name = "masc_especie")
    private String species; // especie
    @Column(name = "masc_edad")
    private int age;
    @Column(name = "masc_raza")
    private String race; // raza
    @Column(name = "masc_peso")
    private double weight; // peso
    @Column(name = "masc_sexo")
    private String sex;


}
