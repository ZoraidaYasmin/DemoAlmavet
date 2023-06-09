package com.example.almavet.Repository;

import com.example.almavet.Entity.Appointmet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AppointmentRepository extends CrudRepository<Appointmet, Integer> {

    @Query("select a  from Appointmet a where a.stateAppointment = :state")
    List<Appointmet> findAllByStateAppointmentenum(String state);


}
