package com.example.almavet.Controller;

import com.example.almavet.Entity.Appointmet;
import com.example.almavet.Entity.Details;
import com.example.almavet.Repository.dto.AppointmentDto;
import com.example.almavet.Service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("details")
public class DetailsController {

    @Autowired
    DetailService detailService;

    @GetMapping
    @RequestMapping(value = "listarDetails", method = RequestMethod.GET)
    public ResponseEntity listaDetails(){
        List<Details> listaDetails = this.detailService.listDetails();
        return ResponseEntity.ok(listaDetails);
    }

    @PostMapping
    @RequestMapping(value = "createDetails", method = RequestMethod.POST)
    public ResponseEntity createDetails( @RequestBody Details details){
        Details details1 = this.detailService.createDetails(details);
        return ResponseEntity.status(HttpStatus.CREATED).body(details1);
    }

    @PutMapping
    @RequestMapping(value = "modifyDetails", method = RequestMethod.PUT)
    public ResponseEntity modifyDetails( @RequestBody Details details){
        Details details1 = this.detailService.modifyDetails(details);
        return ResponseEntity.status(HttpStatus.CREATED).body(details1);
    }

    @GetMapping
    @RequestMapping(value = "listarDetailsHC/{dni}/{name}", method = RequestMethod.GET)
    public ResponseEntity listaDetails(@PathVariable String dni, @PathVariable String name){
        List<String> listaDetails = this.detailService.listDetailsHC(dni, name);
        return ResponseEntity.ok(listaDetails);
    }

    @DeleteMapping
    @RequestMapping(value = "deleteDetails/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteDetails( @PathVariable int id){
        this.detailService.deleteDetails(id);
        return ResponseEntity.ok().build();
    }
}
