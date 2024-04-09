/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Alvaro Dinten
 */
public class Asignatura {
    private int codigo;
    private String nombre;
    private int horasAnuales;
    private Profesor profesor;
    private ArrayList<Alumno> listaAlumnos;

    /**
     * Devuelve el atributo codigo de Asignatura
     * @return Devuelvo un int el atributo codigo de Asignatura
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Modifica el valor del atributo codigo de Asignatura
     * @param codigo valor del atributo codigo de Asignatura
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Devuelve el atributo nombre de Asignatura
     * @return Devuelvo un String con el nombre de Asignatura
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el valor del atributo nombre de Asignatura
     * @param nombre valor del atributo nombre de Asignatura
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el atributo horasAnuales de Asignatura
     * @return Devuelvo un int con horasAnuales de Asignatura
     */
    public int getHorasAnuales() {
        return horasAnuales;
    }

    /**
     * Modifica el valor del atributo horasAnuales de Asignatura
     * @param horasAnuales valor del atributo horasAnuales de Asignatura
     */
    public void setHorasAnuales(int horasAnuales) {
        this.horasAnuales = horasAnuales;
    }

    /**
     * Devuelve el atributo profesor de Asignatura
     * @return Devuelvo el atributo profesor de Asignatura
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Modifica el valor del atributo profesor de Asignatura
     * @param profesor valor del atributo profesor de Asignatura
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * Devuelve el atributo listaAlumnos de Asignatura
     * @return Devuelvo el ArrayList listaAlumnos de Asignatura
     */
    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    /**
     * Modifica el valor del atributo listaAlumnos de Asignatura
     * @param listaAlumnos valor del atributo listaAlumnos de Asignatura
     */
    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    /**
     * Constructor de la clase Asignatura
     * @param codigo Valor de codigo de Asignatura
     * @param nombre Valor de nombre de Asignatura
     * @param horasAnuales Valor de horasAnuales de Asignatura
     * @param profesor Valor de profesor de Asignatura
     * @param listaAlumnos Valor de listaAlumnos de Asignatura
     */
    public Asignatura(int codigo, String nombre, int horasAnuales, Profesor profesor, ArrayList<Alumno> listaAlumnos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasAnuales = horasAnuales;
        this.profesor = profesor;
        this.listaAlumnos = listaAlumnos;
    }
    
    
}
