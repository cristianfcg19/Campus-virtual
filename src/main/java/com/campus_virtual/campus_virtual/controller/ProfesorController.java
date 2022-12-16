/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.controller;

import com.campus_virtual.campus_virtual.domain.Profesor;
import com.campus_virtual.campus_virtual.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Christian
 */
@Controller
public class ProfesorController {
 
    @Autowired
    private ProfesorService profesorService;
   
     
       @GetMapping("/profesor")
    public String profesor (Model model)
    {
        
        
          var profesor=profesorService.getProfesors();
          model.addAttribute("profesores", profesor);
        
        return "profesores/Profesor";
    } 
     
     
    @GetMapping("/profesor/nuevo")
    public String profesorNuevo(Profesor profesor)
    {
             
        return "profesores/CrearProfesor";
    }
    
    
    @PostMapping("/profesor/guardar")
    public String profesorGuardar(Profesor profesor)
    {
        profesorService.save(profesor);
        return "redirect:/profesor";
    }
    
    
        
    @GetMapping("/profesor/modificar/{clave_p}")
    public String profesorActualiza(Profesor profesor,Model model)
    {
          profesor=profesorService.getProfesor(profesor);
          model.addAttribute("profesor", profesor);
          return "profesores/CrearProfesor";
    }
    
 
     @GetMapping("/profesor/eliminar/{clave_p}")
    public String profesorEliminar(Profesor profesor)
    {
          profesorService.delete(profesor);
           return "redirect:/profesor";
    }
    
}
