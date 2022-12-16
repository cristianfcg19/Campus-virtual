/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.dao.*;
import com.campus_virtual.campus_virtual.domain.*;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Christian
 */

public interface Materia_alumnoService {

        
public List <Materia_alumno> getMateria_alumnos();

public Materia_alumno  getMateria_alumno(Materia_alumno materia_alumno);

public void  save(Materia_alumno materia_alumno);

public  void delete(Materia_alumno materia_alumno);  
}
