/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.List;

/**
 *
 * @author Luis
 */
public class Grafo {
    private int numPaises;
    private List<Vertice> listaVertices; //Para formar el grafo

    public int getNumPaises() {
        return numPaises;
    }

    public void setNumPaises(int numPaises) {
        this.numPaises = numPaises;
    }

    public List<Vertice> getListaVertices() {
        return listaVertices;
    }

    public void setListaVertices(List<Vertice> listaVertices) {
        this.listaVertices = listaVertices;
    }
}
