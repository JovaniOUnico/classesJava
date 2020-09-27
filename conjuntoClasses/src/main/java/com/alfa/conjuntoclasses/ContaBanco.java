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
public class ContaBanco {
       
    public String numConta;
    protected String tipo; // CC - corrente CP - poupança
    private String dono;
    private Double saldo;
    private boolean status;
    
    public void ContaBanco(){
        this.status = false;
        this.saldo =0.0;
    }
    
    public boolean abrirConta(String tipo){
        boolean r =true;
        this.setStatus(true);
        try{
            this.setTipo(tipo);
            
            if(this.getTipo().equals("CC")){
                this.setSaldo(50.0);
            }else if(this.getTipo().equals("CP")){
                this.setSaldo(150.0);
            }else{
                this.setSaldo(0.0);
                this.setStatus();
                r = false;
            }
            
            
        }catch(Exception e){
            r =false;
        }
        return r;
    }

    public boolean fecharConta(){
        boolean r =false;
        if(this.getSaldo()>0 && this.getStatus()){
            
        }else if(this.getSaldo()<0 && this.getStatus()){
               
        }else{
            this.setStatus();
            r=true;
        }
        return r;
    }
    
    public boolean pagarMensal(){
        Double valor;
        if(this.getTipo().equals("CC")){
            valor =12.0;
        }else if(this.getTipo().equals("CP")){
            valor =20.0;
        }
        boolean r = this.sacar(valor);
        return r;
    }

    public boolean depositar(double valor){
        if(this.status){
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
        
    }
       
    public boolean sacar(Double valor){
        boolean r =true;
        if(this.saldo<valor || !this.status){
            r = false;
        }else if(this.getStatus()){
            this.saldo -= valor;
        }
        return r;
    }
               
    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 
    
    public void setStatus() {
        this.status = !this.status;
    }     
       
}   
