package com.usa.misiontic.proyectociclo3.repository;


import com.usa.misiontic.ProyectoCiclo3.entities.Reservation;
import com.usa.misiontic.ProyectoCiclo3.repository.crudRepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservasRepository {

    @Autowired
    private ReservationCrudRepository reservasCrudRepository;
    public List<Reservation> getAll(){
        return (List<Reservation>) reservasCrudRepository.findAll();
    }
    public Optional<Reservation> getReservas(int id){
        return reservasCrudRepository.findById(id);
    }
    public Reservation save(Reservation p){
        return reservasCrudRepository.save(p);
    }
    public void delete(Reservation p){
        reservasCrudRepository.delete(p);
    }

}
