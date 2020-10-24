/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.interacao;

/**
 *
 * @author jovani
 */
public class Aula {

    
    
    private String diaDaSemanaQueOcorre[];
    private String nomeProfessor;
    private String nomeDisciplina;
    private String horarioQueOcorre;
    private Integer qtdAvaliacoes;
    
    public Aula(String[] diaDaSemanaQueOcorre, String nomeProfessor, String nomeDisciplina, String horarioQueOcorre, Integer qtdAvaliacoes) {
        this.diaDaSemanaQueOcorre = diaDaSemanaQueOcorre;
        this.nomeProfessor = nomeProfessor;
        this.nomeDisciplina = nomeDisciplina;
        this.horarioQueOcorre = horarioQueOcorre;
        this.qtdAvaliacoes = qtdAvaliacoes;
    }

    public String[] getDiaDaSemanaQueOcorre() {
        return diaDaSemanaQueOcorre;
    }

    public void setDiaDaSemanaQueOcorre(String[] diaDaSemanaQueOcorre) {
        this.diaDaSemanaQueOcorre = diaDaSemanaQueOcorre;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getHorarioQueOcorre() {
        return horarioQueOcorre;
    }

    public void setHorarioQueOcorre(String horarioQueOcorre) {
        this.horarioQueOcorre = horarioQueOcorre;
    }

    public Integer getQtdAvaliacoes() {
        return qtdAvaliacoes;
    }

    public void setQtdAvaliacoes(Integer qtdAvaliacoes) {
        this.qtdAvaliacoes = qtdAvaliacoes;
    }
    
    public double getMedia(Double[] nota){
        
        if(nota.length > this.qtdAvaliacoes ){
            return -1;
        }else{
            double result=0;
            for(int i = 0;i<nota.length;i++){
                result += nota[i];
            }
            result = result/nota.length;
            return result;
        }
    }
    
    
}
