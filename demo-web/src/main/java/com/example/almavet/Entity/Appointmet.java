package com.example.almavet.Entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "cita")
public class Appointmet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cita_id")
    private int idAppointment;

    @Column(name = "clie_id")
    private int idClient;
    @Column(name = "serv_id")
    private int idService;
    @Column(name = "masc_id")
    private int idPet;

    @Column(name = "cita_estado")
    private String stateAppointment;

    @Column(name = "cita_fecha")
    private Date dateAppointment;
    @Column(name = "cita_hora_ini")
    private Time timeIni;
    @Column(name = "cita_hora_fin")
    private Time timeEnd;
    @Column(name = "cita_nota")
    private String note;
}
