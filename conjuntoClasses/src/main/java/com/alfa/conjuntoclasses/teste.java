/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.conjuntoclasses;

/**
 *
 * @author jovani
 */
public class teste {
       
    public static void main(String[] args){
        Caneta aux = new Caneta("azul",900,"grossa");
        aux.desTampar();
        aux.escreva("ola mundo");
        
        String[] rep = new String[2];
        rep[0] = "gemulação";
        rep[1] = "gemiparidade";
        
        String nomeCientifico ="esponjilusfamiliares";
        String DataDescoberta="10/2/1910";
        String[] Habitats = new String[1];
        Habitats[0] = "marinho";
        Double altura = 0.0;
        Integer tempoDeVida = 120;
        
        Poriferos esponja;
//        esponja = new Poriferos(rep,nomeCientifico, DataDescoberta,Habitats,altura,tempoDeVida);
//        esponja.reproduzir();
        
        Cachorro caramelo = new Cachorro();
        caramelo.falar();
        caramelo.falar("cães falam?");
        
    }
    
}
