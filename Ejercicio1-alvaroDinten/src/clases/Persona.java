/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Alvaro Dinten
 */
public abstract class Persona {
    private String nombre;
    private String dni;

    /**
     * Devuelve el atributo persona
     * @return Devuelvo el atributo persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el valor del atributo nombre de persona
     * @param nombre valor del atributo nombre de persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el atributo dni de persona
     * @return Devuelve el atributo dni de persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Modifica el valor del atributo dni de persona
     * @param dni valor del atributo dni de persona
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Constructor de la clase Persona
     * @param nombre Nombre de la persona
     * @param dni Dni de la persona
     */
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    
}
