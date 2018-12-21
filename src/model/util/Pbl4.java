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
public class Pbl4 {

    public static void main(String[] args) throws CidadeExistenteException, ArestaExistenteException {
        Grafo grafo= new Grafo();
        Cidade cidade1 = new Cidade(10,20,"salvador");
        Cidade cidade2 = new Cidade(5,10,"ribeira do pombal");
        Cidade cidade3 = new Cidade(3,5,"vitoria da conquista");
        Cidade cidade4 = new Cidade(1,23,"feira de santana");        
        Cidade cidade5 = new Cidade(1,23,"Bom senhor do bomfim");        
        Rota rota1 = new Rota(200);
        Rota rota2 = new Rota(300);
        Rota rota3 = new Rota(400);
        Rota rota4 = new Rota(500);
        
        grafo.addCidade(cidade1);
        grafo.addCidade(cidade2);
        grafo.addCidade(cidade3);
        grafo.addCidade(cidade4);
        grafo.addCidade(cidade5);
        grafo.conectaCidades(cidade1, cidade2, rota1);
        grafo.conectaCidades(cidade2, cidade3, rota2);
        grafo.conectaCidades(cidade3, cidade4, rota3);
        grafo.conectaCidades(cidade2, cidade5, rota4);
        
        System.out.println(grafo.grau(cidade2));
        
        System.out.println(grafo.quantidadeCidades());
        
        System.out.println(grafo.cidades());
    }
    
}
