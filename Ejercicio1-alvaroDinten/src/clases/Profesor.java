/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Alvaro Dinten
 */
public class Profesor extends Persona{
    private String departamento;

    /**
     * Devuelve el atributo departamento de Profesor
     * @return atributo departamento de Profesor
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Modifica el valor del atributo departamento de Profesor
     * @param departamento valor del atributo departamento de Profesor
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Constructor de la clase Profesor
     * @param departamento Valor del departamento del Profesor
     * @param nombre Valor del Nombre del Profesor
     * @param dni Valor del Dni del Profesor
     */
    public Profesor(String departamento, String nombre, String dni) {
        super(nombre, dni);
        this.departamento = departamento;
    }
    
    
}
