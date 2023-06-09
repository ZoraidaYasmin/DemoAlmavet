package com.example.almavet.Service.impl;


import com.example.almavet.Entity.Details;
import com.example.almavet.Repository.DetailRepository;
import com.example.almavet.Service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetailsServiceImpl implements DetailService {

    @Autowired
    DetailRepository detailServiceRepository;

    @Override
    public List<Details> listDetails() {
        return (List<Details>) detailServiceRepository.findAll();
    }

    @Override
    public Details createDetails(Details details) {

        details.setIdAppointment(details.getIdAppointment());
        details.setDateDetailService(details.getDateDetailService());
        details.setMotivConsul(details.getMotivConsul());
        details.setTreatmentConsul(details.getTreatmentConsul());
        details.setExamConsul(details.getExamConsul());
        details.setDetailExamConsul(details.getDetailExamConsul());
        details.setDateControl(details.getDateControl());
        details.setNameVaccine(details.getNameVaccine());
        details.setTypeDeworming(details.getTypeDeworming());
        details.setDewormingMark(details.getDewormingMark());
        details.setTypeBathroomHair(details.getTypeBathroomHair());
        details.setNailCutting(details.getNailCutting());
        details.setHaircut(details.getHaircut());

        return this.detailServiceRepository.save(details);
    }

    @Override
    public Details modifyDetails(Details details) {
        return this.detailServiceRepository.save(details);
    }

    @Override
    public List<String> listDetailsHC(String dni, String name) {
        return (List<String>) this.detailServiceRepository.listDetailsHC(dni, name);
    }

    @Override
    public void deleteDetails(int id) {
        this.detailServiceRepository.deleteById(id);
    }
}
