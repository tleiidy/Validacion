/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.*;
import javax.validation.constraints.Size;

/**
 *
 * @author Leidy Torres
 */
@Named(value = "persona")
@RequestScoped
public class Persona {

    /**
     * Variable que almacen el nombre
     */
    private String nombre;
    
    /**
     * Variable que almacena la edad
     */
    private Integer edad;
    
    /**
     * Variable que almacena la fecha
     */
    private Date fecha;
    
    /**
     * Variable que almacena el correo
     */
    private String correo;
    
    /**
     * Variable que almacena la descripcion
     */
    private String descripcion;
    
    /**
     * Variable que almacena el dato de la moneda
     */
    private Double moneda;
    
    /**
     * Creates a new instance of Persona
     */
    public Persona() {
    }

    /**
     * Retorna el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna la edad
     * @return 
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * Modifica la edad
     * @param edad 
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * Retorna la fecha
     * @return 
     */
    public Date getFecha() {
        return fecha;
    }
    
    /**
     * Modifica la fecha
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Retorna el correo
     * @return 
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Modifica el correo
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Retorna la descripcion
     * @return 
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripcion
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Retorna la moneda
     * @return 
     */
    public Double getMoneda() {
        return moneda;
    }

    /**
     * Modifica la moneda
     * @param moneda 
     */
    public void setMoneda(Double moneda) {
        this.moneda = moneda;
    }
   
}
