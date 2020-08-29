/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.caneta;

/**
 *
 * @author jovani
 */
public class Casa {
    
    private Double larguraTerreno;
    private Double comprimentoTerreno;
    private Double areaTerreno;
    private Double valorCasa;
    private String Cep;

    public Casa(Double larguraTerreno, Double comprimentoTerreno, Double areaTerreno, Double valorCasa, String Cep) {
        
        this.larguraTerreno = larguraTerreno;
        this.comprimentoTerreno = comprimentoTerreno;
        this.areaTerreno = areaTerreno;
        this.valorCasa = valorCasa;
        this.Cep = Cep;
    }
    
    public Double getLarguraTerreno() {
        return larguraTerreno;
    }

    public void setLarguraTerreno(Double larguraTerreno) {
        this.larguraTerreno = larguraTerreno;
    }

    public Double getComprimentoTerreno() {
        return comprimentoTerreno;
    }

    public void setComprimentoTerreno(Double comprimentoTerreno) {
        this.comprimentoTerreno = comprimentoTerreno;
    }

    public Double getAreaTerreno() {
        return areaTerreno;
    }

    public void setAreaTerreno(Double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    public Double getValorCasa() {
        return valorCasa;
    }

    public void setValorCasa(Double valorCasa) {
        this.valorCasa = valorCasa;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }
    
}
