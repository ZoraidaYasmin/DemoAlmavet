package com.example.almavet.Service.impl;

import com.example.almavet.Entity.Cliente;
import com.example.almavet.Entity.Pet;
import com.example.almavet.Repository.ClienteRepository;
import com.example.almavet.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> listCliente() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        cliente.setName(cliente.getName());
        cliente.setLastName(cliente.getLastName());
        cliente.setCellphone(cliente.getCellphone());
        cliente.setEmail(cliente.getEmail());
        cliente.setDni(cliente.getDni());
        return this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente modifyCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente findById(int id) {
        return this.clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> findCliente(String dni) {
        return this.clienteRepository.findAllByDni(dni);
    }

    @Override
    public void deleteCliente(int id) {
        this.clienteRepository.deleteById(id);
    }

    @Override
    public List<String> listPetbyDni(String dni) {
        return this.clienteRepository.listPetbyDni(dni);
    }
}
