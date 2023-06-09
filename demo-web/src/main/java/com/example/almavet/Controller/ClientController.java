package com.example.almavet.Controller;

import com.example.almavet.Entity.Cliente;
import com.example.almavet.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    @RequestMapping(value = "listClient", method = RequestMethod.GET)
    public ResponseEntity consultarCliente(){
        List<Cliente> listaCliente = this.clienteService.listCliente();
        return ResponseEntity.ok(listaCliente);
    }

    @PostMapping
    @RequestMapping(value = "createClient", method = RequestMethod.POST)
    public ResponseEntity createCliente( @RequestBody Cliente cliente){
        Cliente clienteC = this.clienteService.createCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteC);
    }

    @PutMapping
    @RequestMapping(value = "modifyClient", method = RequestMethod.PUT)
    public ResponseEntity modifyCliente( @RequestBody Cliente cliente){
        Cliente clienteM = this.clienteService.modifyCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteM);
    }

    @GetMapping
    @RequestMapping(value = "findClientByDni/{dni}", method = RequestMethod.GET)
    public ResponseEntity findCliente( @PathVariable String dni){
        Cliente clienteF = this.clienteService.findCliente(dni);
        return ResponseEntity.ok(clienteF);
    }

    @DeleteMapping
    @RequestMapping(value = "deleteClient/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteCliente( @PathVariable int id){
        this.clienteService.deleteCliente(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    @RequestMapping(value = "findPetByDni/{dni}", method = RequestMethod.GET)
    public ResponseEntity findPetByDni( @PathVariable String dni){
        List<String> stringC = this.clienteService.listPetbyDni(dni);
        return ResponseEntity.ok(stringC);
    }
}
