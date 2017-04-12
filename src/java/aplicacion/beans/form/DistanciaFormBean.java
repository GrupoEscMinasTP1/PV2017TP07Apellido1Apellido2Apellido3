/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans.form;

import aplicacion.modelo.dominio.Distancia;
import aplicacion.modelo.dominio.Punto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author GustsoNT
 */
@ManagedBean
@RequestScoped
public class DistanciaFormBean {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double resultado;
    /**
     * Creates a new instance of DistanciaFormBean
     */
    public DistanciaFormBean() {        
    }
    
    public void calcularDistancia(){
        Punto unPuntoA = new Punto(getX1(), getY1());    
        Punto unPuntoB = new Punto(getX2(), getY2());       
        Distancia distancia = new Distancia();
        setResultado(distancia.calcularDistancia(unPuntoA,unPuntoB));        
    }

    /**
     * @return the x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * @return the y1
     */
    public double getY1() {
        return y1;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }

    /**
     * @return the x2
     */
    public double getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }

    /**
     * @return the y2
     */
    public double getY2() {
        return y2;
    }

    /**
     * @param y2 the y2 to set
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

      
}
