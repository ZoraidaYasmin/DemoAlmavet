package com.example.almavet.Repository.dto;

import com.example.almavet.Entity.Cliente;
import com.example.almavet.Entity.Pet;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;
@Getter
@Setter
public class AppointmentDto {

    private int idAppointment;
    private int idClient;
    private int idService;
    private int idPet;
    private String state;
    private Date dateAppointment;
    private Time timeIni;
    private Time timeEnd;
    private String note;
    private String nombreMascotaSeleccionada;

    private Cliente cliente;
    private Pet pet;
}
