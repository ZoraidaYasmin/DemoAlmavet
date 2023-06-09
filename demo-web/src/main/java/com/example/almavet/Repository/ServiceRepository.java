package com.example.almavet.Repository;

import com.example.almavet.Entity.ServiceVet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<ServiceVet, Integer> {
}
