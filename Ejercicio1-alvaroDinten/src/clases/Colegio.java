/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Alvaro Dinten
 */
public class Colegio {
    private ArrayList<Asignatura> listaAsignaturas;
    private ArrayList<Persona> listaPersonas;

    /**
     * Constructor de la clase Colegio
     * @param listaAsignaturas ArrayList con la lista de Asignaturas
     * @param listaPersonas ArrayList con la lista de Personas
     */
    public Colegio(ArrayList<Asignatura> listaAsignaturas, ArrayList<Persona> listaPersonas) {
        this.listaAsignaturas = listaAsignaturas;
        this.listaPersonas = listaPersonas;
    }
    
    /**
     * Guarda los datos de listaAsignaturas y de listaPersonas
     */
    public void guardarDatos(){
    }
    
    /**
     * Carga los datos de listaAsignaturas y de listaPersonas
     */
    public void cargarDatos(){
    }
    
    /**
     * Lista los profesores guardados en listaPersonas
     */
    public void listarProfesores(){
    }
    
    /**
     * Lista los alumnos guardados en listaPersonas
     */
    public void listarAlumnos(){
    }
    
    /**
     * Da de alta un profesor en listaPersonas
     * @param dni Valor del dni del Profesor
     * @param nombre Valor del nombre del Profesor
     * @param departamento Valor del departamento del Profesor
     */
    public void altaProfesor(String departamento, String nombre, String dni){
    }
    
    /**
     * Da de alta un Alumno en listaPersonas
     * @param nacionalidad Valor del nacionalidad del Alumno
     * @param nombre Valor del nombre del Alumno
     * @param dni Valor del dni del Alumno
     */
    public void altaAlumno(String nacionalidad, String nombre, String dni){
    }
    
    /**
     * Da de alta un Asignatura en listaAsignaturas
     * @param codigo Valor del codigo de Asignatura
     * @param nombre Valor del nombre de Asignatura
     * @param horasAnuales Valor del horasAnuales de Asignatura
     * @param dni Valor del dni del Profesor
     */
    public void altaAsignatura(int codigo, String nombre, int horasAnuales, String dni){
    }
    
    /**
     * Matricula alumno en una Asignatura
     * @param codigo Valor del codigo de Asignatura
     * @param dni Valor del dni del Alumno
     */
    public void matricularAlumno(int codigo, String dni){
    }
    
    /**
     * Devuelve el numero de asignaturas impartidas por un profesor
     * @param dni Valor del dni del Profesor
     * @return Un int con el numero de asiganturas impartidas
     */
    public int cantidadAsignaturas(String dni){
    return 0;
    }
    
    /**
     * Devuelve la asignatura con mas Alumnos
     * @return La asignatura con mas alumnos
     */
    public Asignatura AsiganturaMasAlumnos(){
        return null;
    }
}
