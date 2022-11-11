/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.controller;

import com.campus_virtual.campus_virtual.domain.Carrera;
import com.campus_virtual.campus_virtual.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author Mateo
 */
@Controller
public class CarreraController {
    @Autowired
    private CarreraService carreraService;
    
    @GetMapping("/carrera")
    public String carrera (Model model){
        var carrera=carreraService.getCarrera();
        model.addAttribute("carreras",carrera);
        return "Carrera";
    }
         
    @GetMapping("/carrera/nuevo")
    public String carreraNueva(Carrera carrera){
        return "CrearCarrera";
    }
    
    @PostMapping("/carrera/guardar")
    public String carreraGuardar(Carrera carrera){
        carreraService.save(carrera);
        return "redirect:/carrera";
    }
    
    @GetMapping("/carrera/modificar/{clave_m}")
    public String carreraActualiza(Carrera carrera,Model model){
        carrera=carreraService.getCarrera(carrera);
        model.addAttribute("carrera",carrera);
        return "CrearCarrera";
    }
    
    @GetMapping("/carrera/eliminar/{clave_m}")
    public String carreraEliminar(Carrera carrera){
        carreraService.delete(carrera);
        return "redirect:/carrera";
    }
}
