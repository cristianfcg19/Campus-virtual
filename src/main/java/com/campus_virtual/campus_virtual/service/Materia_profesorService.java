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

public interface  Materia_profesorService {
    
    
public List <Materia_profesor> getMateria_profesors();

public Materia_profesor  getMateria_profesor(Materia_profesor materia_profesor);

public void  save(Materia_profesor materia_profesor);

public  void delete(Materia_profesor materia_profesor);  
    
    
    
}
