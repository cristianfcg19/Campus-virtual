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
 * @author Mateo la clase materia fue realizada por Mateo
 */
@Data
@Entity
@Table(name="tbmateria")
public class Materia {
    @Id
    private long clave_m;
    private String nombre;
    private int credito;
    
    public Materia(long clave_m,String nombre,int credito){
        this.clave_m = clave_m;
        this.nombre = nombre;
        this.credito = credito;
    }
    
    public Materia(){
        
    }
}
