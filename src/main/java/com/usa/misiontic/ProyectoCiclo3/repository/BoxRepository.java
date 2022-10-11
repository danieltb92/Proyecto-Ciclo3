package com.usa.misiontic.proyectociclo3.repository;

import com.usa.misiontic.ProyectoCiclo3.entities.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import com.usa.misiontic.ProyectoCiclo3.repository.crudRepository.BoxCrudRepository;

@Repository
public class BoxRepository {
    @Autowired
    private BoxCrudRepository boxCrudRepository;

    public List<Box> getAll(){
        return (List<Box>) boxCrudRepository.findAll();
    }

    public Optional<Box> getBox(int id){
        return boxCrudRepository.findById(id);
    }
    public Box save(Box c){
        return boxCrudRepository.save(c);
    }
    public void delete(Box c){
        boxCrudRepository.delete(c);
    }

}
