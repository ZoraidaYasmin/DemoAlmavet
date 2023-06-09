package com.example.almavet.Service.impl;

import com.example.almavet.Entity.Appointmet;
import com.example.almavet.Repository.AppointmentRepository;
import com.example.almavet.Service.AppointmentService;
import com.example.almavet.Util.StateAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public List<Appointmet> listAppointmet() {
        return (List<Appointmet>) appointmentRepository.findAll();
    }

    @Override
    public Appointmet createAppointmet(Appointmet appointmet) {

        appointmet.setIdClient(appointmet.getIdClient());
        appointmet.setIdService(appointmet.getIdService());
        appointmet.setIdPet(appointmet.getIdPet());
        appointmet.setStateAppointment(appointmet.getStateAppointment());
        appointmet.setDateAppointment(appointmet.getDateAppointment());
        appointmet.setTimeIni(appointmet.getTimeIni());
        appointmet.setTimeEnd(appointmet.getTimeEnd());
        appointmet.setNote(appointmet.getNote());

        Appointmet savedAppointment = appointmentRepository.save(appointmet);

        return savedAppointment;
    }

    @Override
    public Appointmet modifyAppointmet(Appointmet appointmet) {
        return this.appointmentRepository.save(appointmet);
    }

    @Override
    public List<Appointmet> findAllByState() {
        return (List<Appointmet>) this.appointmentRepository.findAllByStateAppointmentenum(StateAppointment.CITA_PENDIENTE.getDescripcion());
    }

    @Override
    public void deleteAppointmet(int id) {
        this.appointmentRepository.deleteById(id);
    }
}
