/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.controller;

import com.campus_virtual.campus_virtual.dao.AlumnoDao;
import com.campus_virtual.campus_virtual.domain.Alumno;
import com.campus_virtual.campus_virtual.domain.Curso;
import com.campus_virtual.campus_virtual.service.AlumnoService;
import com.campus_virtual.campus_virtual.service.CursoService;
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
public class CursoController {
  @Autowired
  private CursoService cursoService;

     
       @GetMapping("/curso")
    public String curso (Model model)
    {
        
          var curso=cursoService.getCursos();
          model.addAttribute("cursos", curso);
          
        return "cursos/Curso";
    } 
     
     
    @GetMapping("/curso/nuevo")
    public String cursoNuevo(Curso curso)
    {
             
        return "cursos/CrearCurso";
    }
    
    
    @PostMapping("/curso/guardar")
    public String cursoGuardar(Curso curso)
    {
        cursoService.save(curso);
        return "redirect:/curso";
    }
    
    
        
    @GetMapping("/curso/modificar/{cod_curso}")
    public String cursoActualiza(Curso curso,Model model)
    {
          curso=cursoService.getCurso(curso);
          model.addAttribute("curso", curso);
          return "cursos/CrearCurso";
    }
    
 
     @GetMapping("/curso/eliminar/{cod_curso}")
    public String cursoEliminar(Curso curso)
    {
          cursoService.delete(curso);
           return "redirect:/curso";
    }   
}
