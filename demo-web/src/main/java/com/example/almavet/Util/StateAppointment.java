package com.example.almavet.Util;

public enum StateAppointment {

    CITA_CONCRETA("Cita Concreta"),
    CITA_PENDIENTE("Cita Pendiente");

    private final String descripcion;


    private StateAppointment(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
