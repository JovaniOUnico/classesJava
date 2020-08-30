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
public class Carro {
    
    private String marca;
    private String motor;
    private Double tamanhoTanque;
    private Double quantidadeCombustivel;
    
    public Carro(String marca, String motor, Double tamanhoTanque, Double quantidadeCombustivel) {
        this.marca = marca;
        this.motor = motor;
        this.tamanhoTanque = tamanhoTanque;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Double getTamanhoTanque() {
        return tamanhoTanque;
    }

    public void setTamanhoTanque(Double tamanhoTanque) {
        this.tamanhoTanque = tamanhoTanque;
    }

    public Double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(Double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

}
