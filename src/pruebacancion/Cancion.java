/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacancion;

/**
 *
 * @author Usuario
 */
public class Cancion {
    String Autor;
    String Titulo;

    public Cancion(String Autor, String Titulo) {
        this.Autor = Autor;
        this.Titulo = Titulo;
    }

    Cancion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Autor=" + Autor + ", Titulo=" + Titulo + '}';
    }
    
}
