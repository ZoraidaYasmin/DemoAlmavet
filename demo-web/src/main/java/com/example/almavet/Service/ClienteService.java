package com.example.almavet.Service;

import com.example.almavet.Entity.Cliente;
import com.example.almavet.Entity.Pet;

import java.util.List;

public interface ClienteService {

    public List<Cliente> listCliente();

    public Cliente createCliente(Cliente cliente);

    public Cliente modifyCliente(Cliente cliente);

    public Cliente findById(int id);

    public Cliente findCliente(String dni);

    public void deleteCliente(int id);

    public List<String> listPetbyDni (String dni);

}
