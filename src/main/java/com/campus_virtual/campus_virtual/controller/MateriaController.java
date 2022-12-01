/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.controller;

import com.campus_virtual.campus_virtual.domain.Materia;
import com.campus_virtual.campus_virtual.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Mateo lo de materia fue realizado por Mateo
 */
@Controller
public class MateriaController {
    
    @Autowired
    private MateriaService materiaService;
    
    @GetMapping("/materia")
    public String materia (Model model){
        var materia=materiaService.getMateria();
        model.addAttribute("materias",materia);
        return "Materia";
    }
         
    @GetMapping("/materia/nuevo")
    public String materiaNueva(Materia materia){
        return "CrearMateria";
    }
    
    @PostMapping("/materia/guardar")
    public String materiaGuardar(Materia materia){
        materiaService.save(materia);
        return "redirect:/materia";
    }
    
    @GetMapping("/materia/modificar/{clave_m}")
    public String materiaActualiza(Materia materia,Model model){
        materia=materiaService.getMateria(materia);
        model.addAttribute("materia",materia);
        return "CrearMateria";
    }
    
    @GetMapping("/materia/eliminar/{clave_m}")
    public String materiaEliminar(Materia materia){
        materiaService.delete(materia);
        return "redirect:/materia";
    }
}
