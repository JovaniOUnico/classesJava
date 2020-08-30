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
public class Cozinha {
    
    private String[] equipamentos;
    private String nomeChefe;
    private String nomeSubchefe;
    private String[] nomeCozinheiros;
    private String[] cardapio;
    private String[]  pedidos;

    public Cozinha(String[] equipamentos, String nomeChefe, String nomeSubchefe, String[] nomeCozinheiros, String[] cardapio, String[] pedidos) {
        this.equipamentos = equipamentos;
        this.nomeChefe = nomeChefe;
        this.nomeSubchefe = nomeSubchefe;
        this.nomeCozinheiros = nomeCozinheiros;
        this.cardapio = cardapio;
        this.pedidos = pedidos;
    }
    
    public String[] getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(String[] equipamentos) {
        this.equipamentos = equipamentos;
    }

    public String getNomeChefe() {
        return nomeChefe;
    }

    public void setNomeChefe(String nomeChefe) {
        this.nomeChefe = nomeChefe;
    }

    public String getNomeSubchefe() {
        return nomeSubchefe;
    }

    public void setNomeSubchefe(String nomeSubchefe) {
        this.nomeSubchefe = nomeSubchefe;
    }

    public String[] getNomeCozinheiros() {
        return nomeCozinheiros;
    }

    public void setNomeCozinheiros(String[] nomeCozinheiros) {
        this.nomeCozinheiros = nomeCozinheiros;
    }

    public String[] getCardapio() {
        return cardapio;
    }

    public void setCardapio(String[] cardapio) {
        this.cardapio = cardapio;
    }

    public String[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(String[] pedidos) {
        this.pedidos = pedidos;
    }
    
    
    
}
