
package com.campus_virtual.campus_virtual.controller;

import com.campus_virtual.campus_virtual.domain.Alumno;

import com.campus_virtual.campus_virtual.service.AlumnoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/* @author m.navarro*/
@Controller

public class AlumnoController {
     @Autowired
    private AlumnoService alumnoService;
   
     
       @GetMapping("/alumno")
    public String alumno (Model model)
    {
        
        
          var alumno=alumnoService.getAlumnos();
          model.addAttribute("alumnos", alumno);
        
        return "alumnos/Alumno";
    } 
     
     
    @GetMapping("/alumno/nuevo")
    public String alumnoNuevo(Alumno alumno)
    {
             
        return "alumnos/CrearAlumno";
    }
    
    
    @PostMapping("/alumno/guardar")
    public String alumnoGuardar(Alumno alumno)
    {
        alumnoService.save(alumno);
        return "redirect:/alumno";
    }
    
    
        
    @GetMapping("/alumno/modificar/{matricula}")
    public String alumnoActualiza(Alumno alumno,Model model)
    {
          alumno=alumnoService.getAlumno(alumno);
          model.addAttribute("alumno", alumno);
          return "alumnos/CrearAlumno";
    }
    
 
     @GetMapping("/alumno/eliminar/{matricula}")
    public String alumnoEliminar(Alumno alumno)
    {
          alumnoService.delete(alumno);
           return "redirect:/alumno";
    }
    
}
