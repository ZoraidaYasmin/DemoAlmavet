package com.example.almavet.Repository.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetDto {

    private int idPet;


    private int idClient;

    private String name;

    private String species; // especie

    private int age;

    private String race; // raza

    private double weight; // peso

    private String sex;

}
