/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.dao.CarreraDao;
import com.campus_virtual.campus_virtual.domain.Carrera;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Christian
 */
@Service
public class CarreraServiceImp implements CarreraService{
 
     @Autowired
    private CarreraDao carreraDao;
    
    @Override
    @Transactional(readOnly =true)
    public List<Carrera> getCarreras() {
        return (List<Carrera>)carreraDao.findAll();
    }

    @Override
    @Transactional(readOnly =true)
    public Carrera getCarrera(Carrera carrera) {
        
    return carreraDao.findById(carrera.getClave_c()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Carrera carrera) {
    carreraDao.save(carrera);
    }

    @Override
    @Transactional
    public void delete(Carrera carrera) {
    carreraDao.delete(carrera);
    }
}
