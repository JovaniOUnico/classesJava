/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.animais;

/**
 *
 * @author jovani
 */

//a classe animal representa o reino animal


public class Animal {
 
    public double peso;
    public String grupo;
    public String sexo;
    public String nome;
    public String cor;
    public float altura;
    public int correndo;
    public boolean faminto;
    public boolean latino;
    public String maior;
 
    public double getPeso() {
        return peso;
    }
 
    public void setPeso(double peso) {
        this.peso = peso;
    }
 
    public String getGrupo() {
        return grupo;
    }
 
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
 
    public String getSexo() {
        return sexo;
    }
 
    public void setSexo(String sexo) {
        this.sexo = sexo;
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
 
    public float getAltura() {
        return altura;
    }
 
    public void setAltura(float altura) {
        this.altura = altura;
    }
 
    public int getCorrendo() {
        return correndo;
    }
 
    public void setCorrendo(int correndo) {
        this.correndo = correndo;
    }
 
    public boolean isFaminto() {
        return faminto;
    }
 
    public void setFaminto(boolean faminto) {
        this.faminto = faminto;
    }
 
    public boolean isLatino() {
        return latino;
    }
 
    public void setLatino(boolean latino) {
        this.latino = latino;
    }
 
    public String getMaior() {
        return maior;
    }
 
    public void setMaior(String maior) {
        this.maior = maior;
    }
   
   
    public void imprimir(){
        System.out.println("Peso: " + this.peso + ", Grupo: " + this.grupo + ", Sexo: " + this.sexo);
    }
   
    public Animal() {
       
    }
   
    public Animal(double peso){
        this.peso = peso;
    }
   
    public Animal(double peso, String grupo){
        this.peso = peso;
        this.grupo = grupo;  
    }
   
    public Animal(double peso, String grupo, String sexo){
        this.peso = peso;
        this.grupo = grupo;  
        this.sexo = sexo;
    }

   
 
   
}