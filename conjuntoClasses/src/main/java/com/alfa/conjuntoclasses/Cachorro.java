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

    



    private String nome;
    private String cor;
    private Double peso;
    private Integer correndo;
    private boolean faminto;
    private boolean latindo;
    private int aux;
    private Random gerador;

    public void Cachorro(String nome,String cor,Double peso){
        this.setCor(cor);
        this.setPeso(peso);
        this.setNome(nome);
        this.gerador = new Random();
    }

    public void status(){

        System.out.println("Nome: " + this.nome);  
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + super.getAltura());
        System.out.println("cor: " + this.cor);

    }

    public void pular(){

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

    public void comer() {

        if (faminto){
            System.out.println(this.nome + " está com fome... alimente-o!");
        } else {
            System.out.println(this.nome + " está sem fome!");
        }        

    }   

    public void falar(){       
        
        this.aux = gerador.nextInt(3);
        if(this.aux == 0){
            System.out.println(this.nome + " está latino freneticamente, o indice foi: " + this.aux);
        } else if(this.aux == 1){
            System.out.println(this.nome + " está uivando, o indice foi: " + this.aux);
        } else {
            System.out.println(this.nome + " está rosnando para você, o indice foi: " + this.aux);
        }
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    
    

}