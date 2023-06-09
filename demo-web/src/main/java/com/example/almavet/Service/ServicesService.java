package com.example.almavet.Service;

import com.example.almavet.Entity.ServiceVet;

import java.util.List;

public interface ServicesService {

    public List<ServiceVet> listService();

    public ServiceVet createService(ServiceVet serviceVet);

    public ServiceVet modifyService(ServiceVet serviceVet);

    public void deleteService(int id);
}
