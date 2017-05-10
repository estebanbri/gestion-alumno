/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnocelsa;

/**
 *
 * @author esteban
 */
public class Alumno {
    private String dni;
    private String apellido;
    private String nombre;
    private String adueda;

    public Alumno(String dni, String apellido, String nombre, String adueda) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.adueda = adueda;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAdueda() {
        return adueda;
    }

    public void setAdueda(String adueda) {
        this.adueda = adueda;
    }
    
    
    
    
}
