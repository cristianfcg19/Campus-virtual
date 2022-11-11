/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.domain.Profesor;
import java.util.List;



/**
 *
 * @author Christian
 */
public interface ProfesorService  {

public List <Profesor> getProfesors();

public Profesor  getProfesor(Profesor profesor);

public void  save(Profesor profesor);

public  void delete(Profesor profesor);
    
}
