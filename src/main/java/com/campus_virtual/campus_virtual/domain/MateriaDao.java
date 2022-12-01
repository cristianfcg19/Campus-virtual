/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.campus_virtual.campus_virtual.dao;

import com.campus_virtual.campus_virtual.domain.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Mateo lo de materiaDao fue realizado por Mateo
 */
public interface MateriaDao extends JpaRepository<Materia, Long>{
    
}
