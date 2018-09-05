/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author Estudiante
 */
public class AUTOR {
    
    String nombre;
    String apellido;

    public AUTOR(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public AUTOR(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
