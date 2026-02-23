package com.tevcol.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Backend Tevcol funcionando correctamente 🚀";
    }

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Stevan, tu backend está activo 🔥";
    }
}