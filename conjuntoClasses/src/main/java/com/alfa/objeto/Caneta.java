/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.objeto;

/**
 *
 * @author jovani
 */
public class Caneta {
    
    private String cor;
    private int qtd_tinta;
    private String ponta;
    private boolean tampada;
    
    public Caneta(String cor,int qtd_tinta,String ponta){
        this.setCor(cor);
        this.setQtdTinta(qtd_tinta);
        this.setPonta(ponta);
        this.tampada = true;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setQtdTinta(int qtd){
        this.qtd_tinta = qtd;
    }
    
    public void setPonta(String ponta){
        this.ponta = ponta;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public int getQtdTinta(){
        return this.qtd_tinta;
    }
    
    public String getPonta(){
        return this.ponta;
    }
    
    private void decrement(){
        this.qtd_tinta--;
    }
    
    public void escreva(String valor){
        if(!this.tampada){
            
        
            for(int i = 0;i<valor.length();i++){    
                char val = valor.charAt(i);
                System.out.print(val);
                this.decrement();
                if(this.qtd_tinta==0){
                    System.out.println("Acabou a tinta");
                }
            }
        
        }else{
            System.out.println("Destampe a Caneta");
        }

    }
    
    public void tampar(){
        System.out.println("Caneta Tampada");
        this.tampada = true;
    }
    
    public void desTampar(){
        System.out.println("Caneta Destampada");
        this.tampada = false;
    }
}
