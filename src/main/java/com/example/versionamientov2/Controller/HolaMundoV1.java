package com.example.versionamientov2.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/v1")
public class HolaMundoV1 {
    @GetMapping
    public String saludo() {
        return "hola mundo";
    }
    @PostMapping
    public String despedida() {
        return "adios v1.1.0";
    }
    
}
