package com.usa.misiontic.ProyectoCiclo3.controller;


import com.usa.misiontic.ProyectoCiclo3.entities.Score;
import com.usa.misiontic.ProyectoCiclo3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/all")
    public List<Score> getAll(){
        return scoreService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score save(@RequestBody  Score p){
        return scoreService.save(p);
    }
}
