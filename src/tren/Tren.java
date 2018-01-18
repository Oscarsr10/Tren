/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tren;

/**
 *
 * @author Oscar
 */
public class Tren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimensiones dimensiones = new Dimensiones(5,2,6);
        Vagon vagon = new Vagon("amarillo",6,dimensiones);
        Vagon vagon1 = new Vagon("blanco",8,5,2,6);
        Vagon vagon2 = new Vagon("amarillo",6,dimensiones);
        Pasajeros vagon3 = new Pasajeros(120,"media","verde",8,dimensiones);
        System.out.println(Calculadora.getRuedas(vagon));
        Locomotora locomotora = new Locomotora("gasolina");
        locomotora.setPrimero(vagon);
        vagon.setSiguiente(vagon1);
        vagon1.setSiguiente(vagon2);
        vagon2.setSiguiente(vagon3);
        Vagon first = new Vagon("amarillo",6,dimensiones);
        Vagon father = first;
        for(int a=0; a < 44; a++) {
            Vagon next = new Vagon("amarillo",6,dimensiones);
            first.setSiguiente(next);
            father = next;
            
        }
        locomotora.setPrimero(first);
        father.setSiguiente(vagon);
    }
    
}
