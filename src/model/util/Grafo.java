/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author weslei
 */
public class Grafo {

    private static Set<Cidade> cidades;

    public Grafo() {
        cidades = new HashSet();
    }
    
    public void addCidade(Cidade cidade) throws CidadeExistenteException{
        if(!cidades.contains(cidade)){
            cidades.add(cidade);
        }else{
            throw new CidadeExistenteException("Cidade ja existente no mapa");
        }
    }
    
    public boolean removeCidade(Cidade cidade) throws CidadeNaoExistenteException{
        if(cidades.contains(cidade)){
            Iterator it =  cidades.iterator();
            while(it.hasNext()){
                Cidade c = ((Cidade)it.next());
                if(cidade.equals(c)){
                    for(Cidade cid : c.getAdjacentes().keySet()){
                        c.removeAresta(cid);
                    }
                    cidades.remove(cidade);
                    return true;
                }
            }
            return false;
        }else{
            throw new CidadeNaoExistenteException("Cidade nao existe no mapa");
        }
    }
    
    public void conectaCidades(Cidade origem, Cidade destino, Rota rota) throws ArestaExistenteException{
        if(!origem.getAdjacentes().containsKey(destino)){
            origem.adicionar_Cidade(rota, destino);
            destino.adicionar_Cidade(rota, origem);
        }else{
            throw new ArestaExistenteException("Aresta ja existente");
        }
    }
    
    public int quantidadeCidades(){
        return cidades.size();
    }
    
    public Set cidades(){
        return cidades;
    }
    
    public int grau(Cidade cidade){
        return cidade.getAdjacentes().size();
    }
    
    public static boolean exists(Cidade cidade){
        return cidades.contains(cidade);
    }
}