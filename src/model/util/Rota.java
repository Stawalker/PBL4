/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

/**
 *
 * @author weslei
 */
public class Rota {

    private int peso;
    private Cidade origem; 
    private Cidade destino;
            
    public Rota(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Peso = " + peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
