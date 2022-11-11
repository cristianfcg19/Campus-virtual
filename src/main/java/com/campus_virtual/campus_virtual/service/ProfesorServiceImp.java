/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.dao.ProfesorDao;
import com.campus_virtual.campus_virtual.domain.Profesor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Christian
 */
@Service
public class ProfesorServiceImp implements ProfesorService{
     
    @Autowired
    private ProfesorDao profesorDao;
    
    @Override
    @Transactional(readOnly =true)
    public List<Profesor> getProfesors() {
        return (List<Profesor>)profesorDao.findAll();
    }

    @Override
    @Transactional(readOnly =true)
    public Profesor getProfesor(Profesor profesor) {
        
    return profesorDao.findById(profesor.getClave_p()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Profesor profesor) {
    profesorDao.save(profesor);
    }

    @Override
    @Transactional
    public void delete(Profesor profesor) {
    profesorDao.delete(profesor);
    }
}
