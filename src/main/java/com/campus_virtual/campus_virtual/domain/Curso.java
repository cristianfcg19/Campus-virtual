/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Christian
 */
@Data
@Entity
@Table(name="tbcurso")
public class Curso {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)    

private  long cod_curso; 
@Column(name = "matricula")
private  long matricula; 
private  long clave_p; 
private  long clave_c;   
private  long clave_m;   
private  long total_asistencia;  
private  long nota; 
private  long cod_estado; 
    public Curso(long cod_curso, long matricula, long clave_p, long clave_c, long clave_m, long total_asistencia, long nota, long cod_estado, Alumno alumno) {
        this.cod_curso = cod_curso;
        this.matricula = matricula;
        this.clave_p = clave_p;
        this.clave_c = clave_c;
        this.clave_m = clave_m;
        this.total_asistencia = total_asistencia;
        this.nota = nota;
        this.cod_estado = cod_estado;
        
    }


    public Curso() {
    }



}
