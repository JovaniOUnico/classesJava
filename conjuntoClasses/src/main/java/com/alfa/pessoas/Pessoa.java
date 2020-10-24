/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.pessoas ;

/**
 *
 * @author jovani
 */
public class Pessoa {
    
    private String nome;
    private Double altura;
    private String sexo;
    private String cor;
    private String telefone;
    
    public void Pessoa(String nome,Double altura,String sexo,String cor,String telefone){
        this.setNome(nome);
        this.setAltura(altura);
        this.setCor(cor);
        this.setTelefone(telefone);
        this.setSexo(sexo);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setAltura(Double altura){
        this.altura = altura;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getSexo(){
        return this.sexo;
    }
    public String getCor(){
        return this.cor;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public Double getAltura(){
        return this.altura;
    }
    
    public void apresentar(){
    
        System.out.println("nome: "+this.nome);
        System.out.println("sexo: "+this.sexo);
        System.out.println("altura: "+this.altura);
        System.out.println("cor: "+this.cor);  
        System.out.println("telefone: "+this.telefone);
        
    }
    
    public void ligar(){
        System.out.println("ligando para telefone: "+this.telefone);
    }
    
}
