package com.example.almavet.Repository;

import com.example.almavet.Entity.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetRepository extends CrudRepository<Pet, Integer> {

    List<Pet> findAllByName(String name);
    Pet findById(int id);
}
