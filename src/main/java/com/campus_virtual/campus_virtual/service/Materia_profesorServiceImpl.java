/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.dao.Materia_profesorDao;
import com.campus_virtual.campus_virtual.domain.Materia_profesor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Christian
 */
@Service
public class Materia_profesorServiceImpl implements Materia_profesorService{
     
     @Autowired
    private Materia_profesorDao materia_profesorDao;
    
    @Override
    @Transactional(readOnly =true)
    public List<Materia_profesor> getMateria_profesors() {
        return (List<Materia_profesor>)materia_profesorDao.findAll();
    }

    @Override
    @Transactional(readOnly =true)
    public Materia_profesor getMateria_profesor(Materia_profesor materia_profesor) {
        
    return materia_profesorDao.findById(materia_profesor.getClave_p1()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Materia_profesor materia_profesor) {
    materia_profesorDao.save(materia_profesor);
    }

    @Override
    @Transactional
    public void delete(Materia_profesor materia_profesor) {
    materia_profesorDao.delete(materia_profesor);
    }
}
