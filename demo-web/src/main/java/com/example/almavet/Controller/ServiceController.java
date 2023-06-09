package com.example.almavet.Controller;


import com.example.almavet.Entity.ServiceVet;
import com.example.almavet.Service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("service")
public class ServiceController {

    @Autowired
    private ServicesService servicesService;

    @GetMapping
    @RequestMapping(value = "listService", method = RequestMethod.GET)
    public ResponseEntity findService(){
        List<ServiceVet> listaServ = this.servicesService.listService();
        return ResponseEntity.ok(listaServ);
    }

    @PostMapping
    @RequestMapping(value = "createService", method = RequestMethod.POST)
    public ResponseEntity createService( @RequestBody ServiceVet pet){
        ServiceVet servi = this.servicesService.createService(pet);
        return ResponseEntity.status(HttpStatus.CREATED).body(servi);
    }

    @PutMapping
    @RequestMapping(value = "modifyService", method = RequestMethod.PUT)
    public ResponseEntity modifyService( @RequestBody ServiceVet servi){
        ServiceVet serviceVet = this.servicesService.modifyService(servi);
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceVet);
    }

    @DeleteMapping
    @RequestMapping(value = "deleteService/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteService( @PathVariable int id){
        this.servicesService.deleteService(id);
        return ResponseEntity.ok().build();
    }
}
