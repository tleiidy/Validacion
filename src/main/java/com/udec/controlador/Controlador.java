/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Leydi
 */
@Named(value = "controlador")
@RequestScoped
public class Controlador {

    /**
     * Variable que almacena el nombre y su tamaño
     */
    @NotNull (message = "El campo es obligatorio")
    @Size (min=3, max=40)
    private String nombre;
    
    /**
     * Variable que almacena la edad y evalua que sea mayor a 18
     */
    @NotNull (message = "El campo es obligatorio")
    @Min(value = 18, message="La edad no debe ser menor a 18")
    private Integer edad;
    
    /**
     * Variable que almacena una fecha que sea mayor al dia de hoy
     */
    @Future
    private Date fecha;
    
    /**
     * Variable que almecena un correo y evalua las expresiones regulares del correo
     */
    @NotNull (message = "El campo es obligatorio")
    @Pattern (regexp = "[\\w\\.-]*[a-zA-Z0-9_]@[\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]", message = "Correo invalido")
    private String correo;
    
    
    /**
     * Creates a new instance of Controlador
     */
    public Controlador() {
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
    
}
