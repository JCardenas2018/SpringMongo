package com.vallegrande.api.Resource;

import com.vallegrande.api.Model.Persona;
import com.vallegrande.api.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PersonaController {

    @Autowired
    private PersonaRepository repository;

    @PostMapping("/addPerson")
    public String savePerson(@RequestBody Persona persona){
        repository.save(persona);
        return "Persona agregada correctamente:" + persona.getIdper();
    }

    @GetMapping("/findAllPerson")
    public List<Persona> getPersons(){
        return repository.findAll();
    }

    @GetMapping("/findAllPerson/{id}")
    public Optional<Persona> getPersons(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/deletePerson/{id}")
    public String deletePerson(@PathVariable int idper){
        repository.deleteById(idper);
        return "Persona eliminada correctamente:" +idper;
    }
}
