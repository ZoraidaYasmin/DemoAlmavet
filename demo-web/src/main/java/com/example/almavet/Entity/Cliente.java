package com.example.almavet.Entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "cliente")
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "clie_id")
  private int idClient;

  @Column(name = "clie_nombre")
  private String name;
  @Column(name = "clie_apellido")
  private String lastName;
  @Column(name = "clie_dni")
  private String dni;
  @Column(name = "clie_celular")
  private String cellphone;
  @Column(name = "clie_correo")
  private String email;


}
