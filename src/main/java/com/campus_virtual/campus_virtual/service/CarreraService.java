/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.service;

import com.campus_virtual.campus_virtual.domain.Carrera;
import java.util.List;
/**
 *
 * @author Mateo
 */
public interface CarreraService {
    public List <Carrera> getCarrera();
    public Carrera getCarrera(Carrera carrera);
    public void save(Carrera carrera);
    public void delete(Carrera carrera);
}
