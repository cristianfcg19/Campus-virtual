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
@Table(name ="alumno_profesor")
public class Alumno_profesor {
 @Id
 private long matricula1; 
 private long clave_p1 ;

    public Alumno_profesor(int matricula1, int clave_p1) {
        this.matricula1 = matricula1;
        this.clave_p1 = clave_p1;
    }
 
 
}
