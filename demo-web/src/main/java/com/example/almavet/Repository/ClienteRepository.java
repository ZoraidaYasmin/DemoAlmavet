package com.example.almavet.Repository;

import com.example.almavet.Entity.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

    Cliente findByDni(String dni);

    Cliente findById(int id);

    @Query("select m.name from Cliente c join Pet m ON m.idClient = c.idClient where c.dni = :dni")
    List<String> listPetbyDni (String dni);
}
