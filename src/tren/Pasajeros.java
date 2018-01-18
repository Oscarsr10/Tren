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
public class Pasajeros extends Vagon {
    private int nAsientos;
    private String clase;
    
    public Pasajeros(int nAsientos, String clase, String color, int nRuedas, float alto, float largo, float ancho) {
        super(color, nRuedas, alto, largo, ancho);
        this.nAsientos = nAsientos;
        this.clase = clase;
    }
    public Pasajeros(int nAsientos, String clase, String color, int nRuedas, Dimensiones dimensiones) {
        super(color, nRuedas, dimensiones);
        this.nAsientos = nAsientos;
        this.clase = clase;
    }
}
