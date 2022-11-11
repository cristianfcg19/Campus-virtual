
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.domain.Alumno;
import java.util.List;

/* @author m.navarro */
public interface AlumnoService {
    public List <Alumno> getAlumnos();

public Alumno  getAlumno(Alumno alumno);

public void  save(Alumno alumno);

public  void delete(Alumno alumno);
    
}
