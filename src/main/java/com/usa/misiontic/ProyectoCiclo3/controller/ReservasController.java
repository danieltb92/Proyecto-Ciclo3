package com.usa.misiontic.proyectociclo3.controller;


import com.usa.misiontic.ProyectoCiclo3.entities.Reservation;
import com.usa.misiontic.proyectociclo3.service.ReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservasController {

    @Autowired
    private ReservasService reservasService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservasService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody  Reservation p){
        return reservasService.save(p);
    }
}
