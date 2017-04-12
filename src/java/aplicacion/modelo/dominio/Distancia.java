/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author GustsoNT
 */
public class Distancia {
    private double d;

    public Distancia() {
    }

    public Distancia(double d) {
        this.d = d;
    }
       
    public double calcularDistancia(Punto A, Punto B){
        d = Math.sqrt(Math.pow((A.getX() - B.getX()), 2) + Math.pow((A.getY()- B.getY()), 2));
        return d;
    }

    /**
     * @return the d
     */
    public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }
    
    
}
