/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.dao.Alumno_profesorDao;
import com.campus_virtual.campus_virtual.domain.Alumno_profesor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Christian
 */
@Service
public class Alumno_profesorServiceimp implements Alumno_profesorService{
         @Autowired
    private Alumno_profesorDao alumno_profesorDao;
    
    @Override
    @Transactional(readOnly =true)
    public List<Alumno_profesor> getAlumno_profesors() {
        return (List<Alumno_profesor>)alumno_profesorDao.findAll();
    }

    @Override
    @Transactional(readOnly =true)
    public Alumno_profesor getAlumno_profesor(Alumno_profesor alumno_profesor) {
        
    return alumno_profesorDao.findById(alumno_profesor.getClave_p1()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Alumno_profesor alumno_profesor) {
    alumno_profesorDao.save(alumno_profesor);
    }

    @Override
    @Transactional
    public void delete(Alumno_profesor alumno_profesor) {
    alumno_profesorDao.delete(alumno_profesor);
    }
    
}
