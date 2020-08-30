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
public class Alunos {
    
    private String nome;
    private String ra;
    private String DataNasc;
    private String Curso;
    private Double[] Notas;

    public Alunos(String nome, String ra, String DataNasc, String Curso, Double[] Notas) {
        this.nome = nome;
        this.ra = ra;
        this.DataNasc = DataNasc;
        this.Curso = Curso;
        this.Notas = Notas;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public Double[] getNotas() {
        return Notas;
    }

    public void setNotas(Double[] Notas) {
        this.Notas = Notas;
    }
    
    public double getMedia(){
        
        double result=0;
        for(int i = 0;i<this.Notas.length;i++){
            result += this.Notas[i];
        }
        result = result/this.Notas.length;
        return result;
        
    }
    
    
}
