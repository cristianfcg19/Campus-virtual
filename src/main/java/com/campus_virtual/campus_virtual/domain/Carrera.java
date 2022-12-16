/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Christian
 */
@Data
@Entity
@Table(name="tbcarrera")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clave_c;
    
    private String nombre;  
    private long duracion;        

    public Carrera(long clave_c, String nombre, long duracion) {
        this.clave_c = clave_c;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Carrera() {
    }



}
