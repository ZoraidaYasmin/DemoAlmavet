package com.example.almavet.Controller;

import com.example.almavet.Entity.Appointmet;
import com.example.almavet.Repository.dto.AppointmentDto;
import com.example.almavet.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    @RequestMapping(value = "listarAppointment", method = RequestMethod.GET)
    public ResponseEntity listarAppointment(){
        List<Appointmet> listaAppointment = this.appointmentService.listAppointmet();
        return ResponseEntity.ok(listaAppointment);
    }

    @PostMapping
    @RequestMapping(value = "createAppointment", method = RequestMethod.POST)
    public ResponseEntity createAppointment( @RequestBody Appointmet appointmentDto){
        Appointmet appointmentDto2 = this.appointmentService.createAppointmet(appointmentDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(appointmentDto2);
    }

    @PutMapping
    @RequestMapping(value = "modifyAppointment", method = RequestMethod.PUT)
    public ResponseEntity modifyAppointment( @RequestBody Appointmet app){
        Appointmet appointmet = this.appointmentService.modifyAppointmet(app);
        return ResponseEntity.status(HttpStatus.CREATED).body(appointmet);
    }

    @GetMapping
    @RequestMapping(value = "findAppointmentStatePending", method = RequestMethod.GET)
    public ResponseEntity findAppointmentStatePending(){
        List<Appointmet> listaAppointment = this.appointmentService.findAllByState();
        return ResponseEntity.ok(listaAppointment);
    }

    @DeleteMapping
    @RequestMapping(value = "deleteAppointment/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteAppointment( @PathVariable int id){
        this.appointmentService.deleteAppointmet(id);
        return ResponseEntity.ok().build();
    }
}
