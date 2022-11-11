/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
/**
 *
 * @author Mateo
 */
@Data
@Entity
@Table(name="tbcarrera")
public class Carrera {
    @Id
    private long clave_m;
    private String nombre;
    private String duracion;
    
    public Carrera(long clave_m,String nombre,String duracion){
        this.clave_m = clave_m;
        this.nombre = nombre;
        this.duracion = duracion;
    }
    
    public Carrera(){
        
    }
}
