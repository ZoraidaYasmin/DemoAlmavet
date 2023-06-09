package com.example.almavet.Service;

import com.example.almavet.Entity.Appointmet;
import com.example.almavet.Repository.dto.AppointmentDto;
import com.example.almavet.Util.StateAppointment;

import java.util.List;

public interface AppointmentService {

    public List<Appointmet> listAppointmet();

    public Appointmet createAppointmet(Appointmet appointmet);

    public Appointmet modifyAppointmet(Appointmet appointmet);

    public List<Appointmet> findAllByState();

    public void deleteAppointmet(int id);
}
