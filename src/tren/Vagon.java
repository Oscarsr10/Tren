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
public class Vagon {
    private String color;
    private int nRuedas;
    private Dimensiones dimensiones;
    private Vagon siguiente;
    
    public Vagon(String color, int nRuedas, float alto, float largo, float ancho) {
        this.color = color;
        this.nRuedas = nRuedas;
        this.dimensiones = new Dimensiones(alto, largo, ancho);
    }

    public Vagon(String color, int nRuedas, Dimensiones dimensiones) {
        this.color = color;
        this.nRuedas = nRuedas;
        this.dimensiones = dimensiones;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getnRuedas() {
        return nRuedas;
    }

    public void setnRuedas(int nRuedas) {
        this.nRuedas = nRuedas;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimensiones dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Vagon getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Vagon siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
    
}
