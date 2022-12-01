/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.domain.Materia;
import java.util.List;
/**
 *
 * @author Mateoo
 */
public interface MateriaService {
    public List <Materia> getMateria();
    public Materia getMateria(Materia materia);
    public void save(Materia materia);
    public void delete(Materia materia);
}
