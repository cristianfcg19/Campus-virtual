/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual.domain;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Christian
 */
@Data
@Entity
@Table(name="tbcurso")
public class Curso implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)    

private  long cod_curso;    
 
private  long total_asistencia;  
private  long nota; 
private  long cod_estado;

    public Curso(long cod_curso, long total_asistencia, long nota, long cod_estado) {
        this.cod_curso = cod_curso;
        this.total_asistencia = total_asistencia;
        this.nota = nota;
        this.cod_estado = cod_estado;
    }



  
    


    public Curso() {
    }



}
