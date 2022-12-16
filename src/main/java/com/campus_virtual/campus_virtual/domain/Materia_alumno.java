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
 * @author Christian
 */
@Entity
@Data
@Table(name ="materia_alumno")
public class Materia_alumno {
    @Id
    private long clave_m1; 
    private long matricula2;

    public Materia_alumno(long clave_m1, long matricula2) {
        this.clave_m1 = clave_m1;
        this.matricula2 = matricula2;
    }
    
}
