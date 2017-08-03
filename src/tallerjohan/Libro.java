/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjohan;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Libro {
    ArrayList libro;

    public Libro() {
    }

    public ArrayList getLibro() {
        return libro;
    }

    public void setLibro(ArrayList libro) {
        this.libro = libro;
    }

    public Libro(ArrayList libro) {
        this.libro = libro;
    }
    public abstract void Ingresar(String nombre);
    
}
