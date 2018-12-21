/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author weslei
 */
public class Cidade {

    private int x;
    private int y;
    private String nome;
    private Map<Cidade, Rota> adjacentes;

    public Cidade(int x, int y, String nome) {
        this.x = x;
        this.y = y;
        this.nome = nome;
        adjacentes = new HashMap<>();
    }

    public void adicionar_Cidade(Rota rota, Cidade destino) {
        if (!Grafo.exists(destino)) {
            System.out.println("Vertice não mapeado.");
        } else if (!adjacentes.containsKey(destino)) {
            adjacentes.put(destino, rota);
        } else {
            System.out.println("Aresta já existe.");
        }
    }

    public void removeAresta(Cidade cidade) {
        if (!adjacentes.containsKey(cidade)) {
            System.out.println("Vertice nao mapeado.");
            return;
        }
        adjacentes.remove(cidade);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Cidade, Rota> getAdjacentes() {
        return adjacentes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.x;
        hash = 29 * hash + this.y;
        hash = 29 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cidade " + nome;
    }

}
