package br.edu.ifms.bhaskaramult.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/mult")
public class MultController {

    @GetMapping (value = "/{x}/{y}")
    public Integer getMult(@PathVariable int x, @PathVariable int y){
        if(x.matches("[0-9]+") && y.matches("[0-9]+")){
             return Integer.parseInt(x) * Integer.parseInt(y);
         } else {
             throw new NotNumericException("Não é permitido letras na conta!");
         }

    }
    
}