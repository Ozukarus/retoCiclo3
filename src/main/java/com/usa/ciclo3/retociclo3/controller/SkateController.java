package com.usa.ciclo3.retociclo3.controller;

import com.usa.ciclo3.retociclo3.model.Skate;
import com.usa.ciclo3.retociclo3.service.SkateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Skate")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class SkateController {
    @Autowired
    private SkateService skateService;

    @GetMapping("/all")
    public List<Skate> getSkate(){
        return skateService.getAll();
    }

    @GetMapping("/{idSkate}")
    public Optional<Skate> getSkate(@PathVariable("idSkate")int id){
        return skateService.getSkate(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Skate save(@RequestBody Skate skate){
        return skateService.save(skate);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int id){
        return skateService.deleteSkate(id);
    }
}

