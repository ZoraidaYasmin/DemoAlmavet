package com.example.almavet.Controller;


import com.example.almavet.Entity.Pet;
import com.example.almavet.Service.PetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    @RequestMapping(value = "listPet", method = RequestMethod.GET)
    public ResponseEntity findPets(){
        List<Pet> listaPet = this.petService.listPet();
        return ResponseEntity.ok(listaPet);
    }

    @PostMapping
    @RequestMapping(value = "createPet", method = RequestMethod.POST)
    public ResponseEntity createPet( @RequestBody Pet pet){
        Pet petC = this.petService.createPet(pet);
        return ResponseEntity.status(HttpStatus.CREATED).body(petC);
    }

    @PutMapping
    @RequestMapping(value = "modifyPet", method = RequestMethod.PUT)
    public ResponseEntity modifyPet( @RequestBody Pet pet){
        Pet petM = this.petService.modifyPet(pet);
        return ResponseEntity.status(HttpStatus.CREATED).body(petM);
    }

    @GetMapping
    @RequestMapping(value = "findPetById/{id}", method = RequestMethod.GET)
    public ResponseEntity findPetById(@PathVariable int id){
        Pet petF = this.petService.findById(id);
        return ResponseEntity.ok(petF);
    }

    @GetMapping
    @RequestMapping(value = "findPetByName/{name}", method = RequestMethod.GET)
    public ResponseEntity<List<Pet>> findPetByName(@PathVariable String name){
        List<Pet> petF = this.petService.findPet(name);
        return ResponseEntity.ok(petF);
    }

    @DeleteMapping
    @RequestMapping(value = "deletePet/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deletePet( @PathVariable int id){
        this.petService.deletePet(id);
        return ResponseEntity.ok().build();
    }
}
