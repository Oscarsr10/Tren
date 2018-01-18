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
public class Locomotora {
    private String motor;
    private Vagon primero;

    public Locomotora(String motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Vagon getPrimero() {
        return primero;
    }

    public void setPrimero(Vagon primero) {
        this.primero = primero;
    }
    
    
}
