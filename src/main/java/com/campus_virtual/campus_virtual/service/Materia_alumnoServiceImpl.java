/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.dao.Materia_alumnoDao;
import com.campus_virtual.campus_virtual.domain.Materia_alumno;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




/**
 *
 * @author Christian
 */
@Service
public class Materia_alumnoServiceImpl implements Materia_alumnoService {
    
    @Autowired
    private Materia_alumnoDao materia_alumnoDao;
    
    @Override
    @Transactional(readOnly =true)
    public List<Materia_alumno> getMateria_alumnos() {
        return (List<Materia_alumno>)materia_alumnoDao.findAll();
    }

    @Override
    @Transactional(readOnly =true)
    public Materia_alumno getMateria_alumno(Materia_alumno materia_alumno) {
        
    return materia_alumnoDao.findById(materia_alumno.getClave_m1()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Materia_alumno materia_alumno) {
    materia_alumnoDao.save(materia_alumno);
    }

    @Override
    @Transactional
    public void delete(Materia_alumno materia_alumno) {
    materia_alumnoDao.delete(materia_alumno);
    }
    
}
