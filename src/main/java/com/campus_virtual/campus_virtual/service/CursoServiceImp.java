/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.dao.AlumnoDao;
import com.campus_virtual.campus_virtual.dao.CursoDao;
import com.campus_virtual.campus_virtual.domain.Alumno;
import com.campus_virtual.campus_virtual.domain.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Christian
 */
@Service
public class CursoServiceImp implements CursoService{
    @Autowired
    private CursoDao cursoDao;
    
    @Autowired
    private AlumnoDao alumnoDao;

    @Override
    @Transactional(readOnly =true)
    public List<Curso> getCursos() {
        return (List<Curso>)cursoDao.findAll();
    }

    @Override
    @Transactional(readOnly =true)
    public Curso getCurso(Curso curso) {
        
    return cursoDao.findById(curso.getCod_curso()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Curso curso) {
     
        
        cursoDao.save(curso);
    }

    @Override
    @Transactional
    public void delete(Curso curso) {
    cursoDao.delete(curso);
    }
}
