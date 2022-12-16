/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.domain.Curso;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface CursoService {
  
    
public List <Curso> getCursos();

public Curso  getCurso(Curso curso);

public void  save(Curso curso);

public  void delete(Curso curso);
}
