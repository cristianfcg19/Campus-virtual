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
@Table(name ="tbprofesor")
public class Profesor {
  @Id
  private long clave_p ;
  private String nombre;
  private String  primer_apellido;
  private String  segundo_apellido;
  private String  direccion;
  private String  telefono;
  private String  horario ;

    public Profesor(long clave_p, String nombre, String primer_apellido, String segundo_apellido, String direccion, String telefono, String horario) {
        this.clave_p = clave_p;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
    }

    public Profesor() {
    }
  
  
    
}
