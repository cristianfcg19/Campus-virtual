
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.dao.AlumnoDao;
import com.campus_virtual.campus_virtual.domain.Alumno;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/*@author m.navarro*/
public class AlumnoServiceImp implements AlumnoService {
     @Autowired
    private AlumnoDao alumnoDao;
    
    @Override
    @Transactional(readOnly =true)
    public List<Alumno> getAlumnos() {
        return (List<Alumno>)alumnoDao.findAll();
    }

    @Override
    @Transactional(readOnly =true)
    public Alumno getAlumno(Alumno alumno) {
        
    return alumnoDao.findById(alumno.getMatricula()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Alumno alumno) {
    alumnoDao.save(alumno);
    }

    @Override
    @Transactional
    public void delete(Alumno alumno) {
    alumnoDao.delete(alumno);
    }
}
