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
public class Dimensiones {
    private float alto;
    private float largo;
    private float ancho;

    public Dimensiones(float alto, float largo, float ancho) {
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
}
