/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.domain;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/** @author m.navarro**/
@Entity
@Data
@Table(name ="tbalumno")
public class Alumno implements Serializable{
@Id 
@Column(name ="matricula")
  private long matricula ;
  private String nombre;
  private String  primer_apellido;
  private String  segundo_apellido;
  private Long  semestre;
  private Long  clave_c1 ;
  private String  logc_a ;

    public Alumno(long matricula, String nombre, String primer_apellido, String segundo_apellido, Long semestre, Long clave_c1, String logc_a) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.semestre = semestre;
        this.clave_c1 = clave_c1;
        this.logc_a = logc_a;
    }

 public Alumno() {
    }
 

}
