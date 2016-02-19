/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros;

/**
 *
 * @author nlopezjimenez
 */
public class Alumno {
    private String nombre;
    private String telefono;
    private int nota;

    public Alumno(String nombre, String telefono, int nota) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.nota = nota;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", telefono=" + telefono + ", nota=" + nota + '}';
    }
    
}
