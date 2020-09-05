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
public class Animal {
    
    private String   nomeCientifico;
    private String   DataDescoberta;
    private String[] HabitatsQueVivem;
    private Double  altura;
    private Integer  tempoDeVida; 
    
    public void Animal(String nomeCientifico,String DataDescoberta,String[] Habitats,Double altura,Integer tempoDeVida){
        this.setAltura(altura);
        this.setDataDescoberta(DataDescoberta);
        this.setHabitatsQueVivem(Habitats);
        this.setTempoDeVida(tempoDeVida);
        this.setNomeCientifico(nomeCientifico);
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getDataDescoberta() {
        return DataDescoberta;
    }

    public void setDataDescoberta(String DataDescoberta) {
        this.DataDescoberta = DataDescoberta;
    }

    public String[] getHabitatsQueVivem() {
        return HabitatsQueVivem;
    }

    public void setHabitatsQueVivem(String[] HabitatsQueVivem) {
        this.HabitatsQueVivem = HabitatsQueVivem;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getTempoDeVida() {
        return tempoDeVida;
    }

    public void setTempoDeVida(Integer tempoDeVida) {
        this.tempoDeVida = tempoDeVida;
    }
    
    public void reproduzir(Animal ani){
        
        if(ani.getNomeCientifico().equals(this.nomeCientifico)){
            System.out.println("Realizando Reprodução");
        }else{
            System.out.println("Não Realiza Reprodução");
        }
        
    }  
    
}
