package com.example.almavet.Entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "detalleservicio")
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dese_id")
    private int idDetailService;

    @Column(name = "cita_id")
    private int idAppointment;
    @Column(name = "dese_fecha_detalle")
    private Date dateDetailService;
    @Column(name = "dese_motivo_consu")
    private String motivConsul;
    @Column(name = "dese_tratamiento_consu")
    private String treatmentConsul; // tratamiento de consulta
    @Column(name = "dese_exa_consu")
    private String examConsul; // 1 - si realizo examen y 0 - no realizo examen
    @Column(name = "dese_detalle_exa_consu")
    private String detailExamConsul;
    @Column(name = "dese_fecha_control")
    private Date dateControl;
    @Column(name = "dese_nom_vacu")
    private String nameVaccine; // nombre de vacuna
    @Column(name = "dese_tipo_despa")
    private String typeDeworming; // tipo desparasitacion
    @Column(name = "dese_marca_despa")
    private String dewormingMark; // marca de desparasitacion
    @Column(name = "dese_tipo_baño_pelu")
    private String typeBathroomHair; // tipo de baño peluqueria
    @Column(name = "dese_corte_uñas_pelu")
    private String nailCutting; //corte de uñas - 1 - si realizo el corte y 0 - no realizo corte
    @Column(name = "dese_corte_pelo_pelu")
    private String haircut; // corte de pelo  - 1 - si realizo corte y 0 - no realizo corte
}
