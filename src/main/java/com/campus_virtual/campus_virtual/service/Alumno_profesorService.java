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

public interface Alumno_profesorService {

public List <Alumno_profesor> getAlumno_profesors();

public Alumno_profesor  getAlumno_profesor(Alumno_profesor alumno_profesor);

public void  save(Alumno_profesor alumno_profesor);

public  void delete(Alumno_profesor alumno_profesor);   
 
}
