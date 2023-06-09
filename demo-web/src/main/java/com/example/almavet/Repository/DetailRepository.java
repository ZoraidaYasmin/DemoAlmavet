package com.example.almavet.Repository;

import com.example.almavet.Entity.Details;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DetailRepository extends CrudRepository<Details, Integer> {

    @Query("select c.idAppointment, m.name, m.species, m.age, m.race, m.weight, m.sex from Appointmet c join " +
            "Cliente cl ON cl.idClient = c.idClient join Pet m ON m.idClient = cl.idClient where cl.dni = :dni and m.name = :name")
    List<String> listDetailsHC (String dni, String name);
}
