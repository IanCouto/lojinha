/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunck.antlr.exemple.jung;
 
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.text.DecimalFormat;


/**
 *
 * @author onofre
 */

public class Aresta {
    private double distance;
    DecimalFormat df = new DecimalFormat("###,##0.00");
    
    public Aresta(Vertice a, Vertice b){
        this.distance = sqrt(pow(a.getCoordX()- b.getCoordX(),2) + pow(a.getCoordY() - b.getCoordY(),2));
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    @Override
    public String toString() {
        return "" + this.df.format(this.distance);
    }
}
