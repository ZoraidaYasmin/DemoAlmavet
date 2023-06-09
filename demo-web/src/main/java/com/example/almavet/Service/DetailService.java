package com.example.almavet.Service;


import com.example.almavet.Entity.Details;
import java.util.List;

public interface DetailService {

    public List<Details> listDetails();

    public Details createDetails(Details appointmet);

    public Details modifyDetails(Details appointmet);

    List<String> listDetailsHC (String dni, String name);

    public void deleteDetails(int id);
}
