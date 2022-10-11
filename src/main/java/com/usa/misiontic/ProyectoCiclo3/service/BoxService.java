package com.usa.misiontic.proyectociclo3.service;


import com.usa.misiontic.ProyectoCiclo3.entities.Box;
import com.usa.misiontic.proyectociclo3.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoxService {

    @Autowired
    private BoxRepository boxRepository;

    public List<Box> getAll(){
        return boxRepository.getAll();
    }
    public Optional<Box> getBox(int id){
        return boxRepository.getBox(id);
    }
    public Box save(Box p){
        if(p.getId()==null){
            return boxRepository.save(p);
        }else{
            Optional<Box> e = boxRepository.getBox(p.getId());
            if(e.isPresent()){
                return p;
            }else{
                return boxRepository.save(p);
            }
        }
    }
    public Box update(Box p){
        if(p.getId()!=null){
            Optional<Box> q = boxRepository.getBox(p.getId());
            if(q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                if(p.getDescription()!=null){
                    q.get().setDescription(p.getDescription());
                }
                if(p.getLocation()!=null){
                    q.get().setLocation(p.getLocation());
                }
                if(p.getCategory()!=null){
                    q.get().setCategory(p.getCategory());
                }

                boxRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Box>p= boxRepository.getBox(id);
        if(p.isPresent()){
            boxRepository.delete(p.get());
            flag=true;
        }
        return flag;

    }


}
