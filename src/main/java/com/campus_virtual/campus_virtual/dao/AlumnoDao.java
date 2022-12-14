/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.campus_virtual.campus_virtual.dao;
import com.campus_virtual.campus_virtual.domain.Alumno;
import com.campus_virtual.campus_virtual.domain.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

/* @author m.navarro*/
public interface AlumnoDao extends JpaRepository<Alumno, Long> {
    
}
