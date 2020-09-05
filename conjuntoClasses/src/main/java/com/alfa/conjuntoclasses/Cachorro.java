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

import java.util.Random;

public class Cachorro extends Animal{



    String nome;
    String cor;
    Double peso;
    Integer correndo;
    boolean faminto;
    boolean latindo;
    int aux;
    Random gerador = new Random();

    public void Cachorro(String nome,String cor,Double peso){
        
    }

    void status(){

        System.out.println("Nome: " + this.nome);  
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + super.getAltura());
        System.out.println("cor: " + this.cor);

    }

    void pular(){

        if (super.getAltura() >= 80){
            System.out.println("Seu cachorro pula alto");
        } else {
            if (super.getAltura() >= 50){
                System.out.println("Seu cachorro pula normalmente");
            } else {
                System.out.println("Seu cachorro pula baixo");
            }  
        }       
  
    }  

    void comer() {

        if (faminto){
            System.out.println(this.nome + " está com fome... alimente-o!");
        } else {
            System.out.println(this.nome + " está sem fome!");
        }        

    }   

    void falar(){       
        
        this.aux = gerador.nextInt(3);
        if(this.aux == 0){
            System.out.println(this.nome + " está latino freneticamente, o indice foi: " + this.aux);
        } else if(this.aux == 1){
            System.out.println(this.nome + " está uivando, o indice foi: " + this.aux);
        } else {
            System.out.println(this.nome + " está rosnando para você, o indice foi: " + this.aux);
        }
        
    }

}