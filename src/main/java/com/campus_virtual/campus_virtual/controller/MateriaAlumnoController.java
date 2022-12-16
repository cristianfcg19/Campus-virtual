/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.controller;

import com.campus_virtual.campus_virtual.domain.Materia_alumno;
import com.campus_virtual.campus_virtual.domain.Materia_alumno;
import com.campus_virtual.campus_virtual.domain.Materia_alumno;
import com.campus_virtual.campus_virtual.service.AlumnoService;
import com.campus_virtual.campus_virtual.service.Materia_alumnoService;
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
public class MateriaAlumnoController {
     
    @Autowired
  private Materia_alumnoService materia_alumnoService;   
       @GetMapping("/materia_alumno")
    public String materia_alumno (Model model)
    {
          Materia_alumno c;
          var materia_alumno=materia_alumnoService.getMateria_alumnos();
          model.addAttribute("materia_alumnos", materia_alumno);
          
        return "MateriaAlumnos/MateriaAlumno";
    } 
     
     
    @GetMapping("/materia_alumno/nuevo")
    public String materia_alumnoNuevo(Materia_alumno materia_alumno)
    {
             
        return "materia_alumnos/CrearMateriaAlumno";
    }
    
    
    @PostMapping("/materia_alumno/guardar")
    public String materia_alumnoGuardar(Materia_alumno materia_alumno)
    {
        materia_alumnoService.save(materia_alumno);
        return "redirect:/materia_alumno";
    }
    
    
        
    @GetMapping("/materia_alumno/modificar/{cod_materia_alumno}")
    public String materia_alumnoActualiza(Materia_alumno materia_alumno,Model model)
    {
          materia_alumno=materia_alumnoService.getMateria_alumno(materia_alumno);
          model.addAttribute("materia_alumno", materia_alumno);
          return "materia_alumnos/CrearMateria_alumno";
    }
    
 
     @GetMapping("/materia_alumno/eliminar/{cod_materia_alumno}")
    public String materia_alumnoEliminar(Materia_alumno materia_alumno)
    {
          materia_alumnoService.delete(materia_alumno);
           return "redirect:/materia_alumno";
    }   
    
    
}


