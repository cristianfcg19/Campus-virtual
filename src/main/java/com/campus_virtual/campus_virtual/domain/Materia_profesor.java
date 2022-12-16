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
public class Materia_profesor {
@Id
    private long matricula1 ; 
    private long clave_p1;

    public Materia_profesor(long matricula1, long clave_p1) {
        this.matricula1 = matricula1;
        this.clave_p1 = clave_p1;
    }
    
    
    
}
