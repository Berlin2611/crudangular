package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping({"/crud/personas"})
public class Controller {
    @Autowired
    PersonaService service;

    @GetMapping
    public List<Persona> listar(){
        return service.listar();
    }

    @PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    }
}
