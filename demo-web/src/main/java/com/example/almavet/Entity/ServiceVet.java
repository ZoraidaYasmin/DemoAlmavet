package com.example.almavet.Entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "servicio")
public class ServiceVet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serv_id")
    private int idService;

    @Column(name = "serv_tipo_servicio")
    private String typeService;

    @Column(name = "serv_fecha_servicio")
    private Date dateService;
}
