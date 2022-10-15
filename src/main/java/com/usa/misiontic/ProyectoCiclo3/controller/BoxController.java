package com.usa.misiontic.Proyectociclo3.controller;



import com.usa.misiontic.ProyectoCiclo3.entities.Box;
import com.usa.misiontic.Proyectociclo3.service.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Box")
public class BoxController {

    @Autowired
    private BoxService boxService;
    @GetMapping("/all")
    public List<Box> getAll(){
        return boxService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Box save(@RequestBody  Box box){
        return boxService.save(box);
    }
    
    @GetMapping("/id")
    public List<Box> getAll(@PathVariable("id")int id){
        return boxService.getAll();
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Box update(@RequestBody  Box p){
        return boxService.update(p);
    }
    
    @DeleteMapping("/id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int id){
        return boxService.delete(id);
    }
}

