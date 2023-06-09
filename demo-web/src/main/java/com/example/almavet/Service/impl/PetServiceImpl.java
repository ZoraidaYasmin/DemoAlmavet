package com.example.almavet.Service.impl;

import com.example.almavet.Entity.Cliente;
import com.example.almavet.Entity.Pet;
import com.example.almavet.Repository.ClienteRepository;
import com.example.almavet.Repository.PetRepository;
import com.example.almavet.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Pet> listPet() {
        return (List<Pet>) petRepository.findAll();
    }

    @Override
    public Pet createPet(Pet pet) throws ResponseStatusException{

        // Obtener el cliente por su DNI
        Cliente cliente = clienteRepository.findById(pet.getIdClient());

        if (cliente == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"El cliente con el idCliente proporcionado no existe");
        }

        pet.setName(pet.getName());
        pet.setIdClient(cliente.getIdClient());
        pet.setSpecies(pet.getSpecies());
        pet.setAge(pet.getAge());
        pet.setRace(pet.getRace());
        pet.setWeight(pet.getWeight());
        pet.setSex(pet.getSex());

        return this.petRepository.save(pet);
    }

    @Override
    public Pet modifyPet(Pet pet) {
        return this.petRepository.save(pet);
    }

    @Override
    public List<Pet> findPet(String name) {
        return (List<Pet>) this.petRepository.findAllByName(name);
    }

    @Override
    public void deletePet(int id) {
        this.petRepository.deleteById(id);
    }
}
