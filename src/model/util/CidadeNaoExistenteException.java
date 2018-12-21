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
public class CidadeNaoExistenteException extends Exception {
    public CidadeNaoExistenteException(String nome){
        super(nome);
    }
}
