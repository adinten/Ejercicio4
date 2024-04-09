/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDate;

/**
 *
 * @author Alvaro Dinten
 */
public class Alumno extends Persona{
    //Atributos
    private LocalDate fechaMatriculacion;
    private String nacionalidad;

    /**
     * Devuelve el atributo fechaMatriculacion de Alumno
     * @return atributo fechaMatriculacion de Alumno
     */
    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    /**
     * Modifica el valor del atributo fechaMatriculacion de Alumno
     * @param fechaMatriculacion valor del atributo fechamatriculacion de Alumno
     */
    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    /**
     * Devuelve el atributo nacionalidad de Alumno
     * @return atributo nacionalidad de Alumno
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Modifica el valor del atributo nacionalidad de Alumno
     * @param nacionalidad valor del atributo nacionalidad de Alumno
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Constructor de la clase Alumno
     * @param fechaMatriculacion Valor de fechaMatriculacion del Alumno
     * @param nacionalidad Valor de nacionalidad del Alumno
     * @param nombre Valor de nombre del Alumno
     * @param dni Valor de dni del Alumno
     */
    public Alumno(LocalDate fechaMatriculacion, String nacionalidad, String nombre, String dni) {
        super(nombre, dni);
        this.fechaMatriculacion = fechaMatriculacion;
        this.nacionalidad = nacionalidad;
    }
    
    
}
