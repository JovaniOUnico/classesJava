/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.animais;


import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jovani
 */
public class Poriferos extends Animal {
    
    private Integer[] reproducao;
    private Random gerador;

   
    
    Poriferos(String[] rep,double peso,String grupo,String sexo,Double altura,Integer tempoDeVida){
        
        
        this.reproducao = new Integer[3];
        this.reproducao[0]=0;
        this.reproducao[1]=0;
        this.reproducao[2]=0;
        
        this.setReproducao(rep);
        
        ArrayList lista = new ArrayList();
        lista.add("marinho");
        lista.add("aquático");
        
        String[] strings = (String[]) lista.toArray (new String[lista.size()]);
        
        
        super.setPeso(peso);
        super.setGrupo(grupo);
        super.setSexo(sexo);
    }

    public Poriferos(String[] rep, String nomeCientifico, String DataDescoberta, String[] Habitats, Double altura, Integer tempoDeVida) {
        this.reproducao = new Integer[3];
        this.reproducao[0]=0;
        this.reproducao[1]=0;
        this.reproducao[2]=0;
        
        this.setReproducao(rep);
        
        ArrayList lista = new ArrayList();
        lista.add("marinho");
        lista.add("aquático");
        
        String[] strings = (String[]) lista.toArray (new String[lista.size()]);
        
        
        super.setPeso(peso);
        super.setGrupo(grupo);
        super.setSexo(sexo);
    }
    
    private void setReproducao(String[] listaReproducao){
        
        for(String rep : listaReproducao){
            this.repAux(rep);
        }
        
    }
    
    private void setReproducao(String reproducao){
        
        this.repAux(reproducao);
        
    }
    
    private void repAux(String rep){
        switch (rep) {
            case "brotamento":
            case "gemiparidade":
                this.reproducao[0]=1;
                break;
            case "gemulação":
                this.reproducao[1]=1;
                break;
            case "regeneração":
               this.reproducao[2]=1;
               break;
            default:
                this.reproducao[0]=0;
                this.reproducao[1]=0;
                this.reproducao[2]=0;
                break;
        }
    }
    
    public void reproduzir(){
        boolean var = false;
        while(!var){
            this.gerador= new Random();
            int value = this.gerador.nextInt(3);
            if(this.reproducao[0]==1 && value == 0){
                System.out.println("realizando reprodução por brotamento ou gemiparidade");
                var =true;
            }else if(this.reproducao[1]==1 && value == 1){
                System.out.println("realizando reprodução por gemulação");
                var =true;
            }else if(this.reproducao[2]==1 && value == 2){
                System.out.println("realizando reprodução por regeneração");
                var =true;
            }
        }
        
    }
    
}
