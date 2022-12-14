package com.usa.misiontic.ProyectoCiclo3.controller;


import com.usa.misiontic.ProyectoCiclo3.entities.Score;
import com.usa.misiontic.ProyectoCiclo3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    
    @GetMapping("/{id}")
    public Optional<Score> getScore(@PathVariable("id")int id){
        return scoreService.getScore(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Score update(@RequestBody  Score p){
        return scoreService.update(p);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int scoreId){
        return scoreService.deleteScore(scoreId);
    }
}
