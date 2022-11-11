
package com.campus_virtual.campus_virtual.controller;

import com.campus_virtual.campus_virtual.domain.Profesor;
import com.campus_virtual.campus_virtual.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/* @author m.navarro*/
public class AlumnoController {
     @Autowired
    private AlumnoService alumnoService;
   
     
       @GetMapping("/alumno")
    public String alumno (Model model)
    {
        
        
          var alumno=alumnoService.getAlumno();
          model.addAttribute("alumnoS", alumno);
        
        return "Alumno";
    } 
     
     
    @GetMapping("/alumno/nuevo")
    public String alumnoNuevo(Profesor alumno)
    {
             
        return "CrearProfesor";
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
          return "CrearProfesor";
    }
    
 
     @GetMapping("/profesor/eliminar/{clave_p}")
    public String profesorEliminar(Profesor profesor)
    {
          profesorService.delete(profesor);
           return "redirect:/profesor";
    }
    
}
