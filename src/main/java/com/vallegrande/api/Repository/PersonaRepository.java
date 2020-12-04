package com.vallegrande.api.Repository;

import com.vallegrande.api.Model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PersonaRepository extends MongoRepository<Persona, Integer> {
    List<Persona>findAll();
    Persona findOne(int id);
    Persona save(Persona p);
    void delete(Persona p);
}
