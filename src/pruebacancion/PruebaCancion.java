/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebacancion;

/**
 *
 * @author Usuario
 */
public class PruebaCancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Michael Jackson","Smoth Criminal");
        
        System.out.println("Autor de la cancion: " + cancion1.getAutor());
        System.out.println("Titulo de la cancion: " + cancion1.getTitulo());
    }
    
}
