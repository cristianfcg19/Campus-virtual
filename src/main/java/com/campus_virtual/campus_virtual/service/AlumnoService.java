/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;


import com.campus_virtual.campus_virtual.domain.Alumno;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface AlumnoService {
    
public List <Alumno> getAlumnos();

public Alumno  getAlumno(Alumno alumno);

public void  save(Alumno alumno);

public  void delete(Alumno alumno);


}
