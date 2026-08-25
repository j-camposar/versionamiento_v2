package com.example.versionamientov2.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/v1")
public class HolaMundoV1Controller {
    @GetMapping
    public String saludo(@AuthenticationPrincipal Jwt jwt) {
        var usuario= jwt.getClaims();
        return "hola mundo - correccion bug v1.1.1 informacion de autenticacion: "+usuario;
    }
    @PostMapping
    public String despedida() {
        return "adios v1.1.0";
    }
    @GetMapping("/public")
    public String publicos() {
        return "Este es un endpoint publico";
    }
    
    
}
