/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.dao.MateriaDao;
import com.campus_virtual.campus_virtual.domain.Materia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Mateo
 */
@Service
public class MateriaServiceImp implements MateriaService{
    @Autowired
    private MateriaDao materiaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Materia> getMateria(){
        return(List<Materia>)materiaDao.findAll();
    }
    
    @Override
    @Transactional(readOnly=true)
    public Materia getMateria(Materia materia){
        return materiaDao.findById(materia.getClave_m()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Materia materia){
        materiaDao.save(materia);
    }
    
    @Override
    @Transactional
    public void delete(Materia materia){
        materiaDao.delete(materia);
    }
}
