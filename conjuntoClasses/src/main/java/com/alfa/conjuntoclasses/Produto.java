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
public class Produto {
    
    
    private String nome;
    private Integer quantidade;
    private Double valorVenda;
    private Double valorCompra;
    private Integer quantidadeVendida;
    
    public void Produto(String nome,Integer qtd,Double vvenda,Double vcompra){
           this.setNome(nome);
           this.setQuantidade(qtd);
           this.setValorCompra(vcompra);
           this.setValorVenda(vvenda);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public void incrementaEstoque(Integer qtd){
        this.quantidadeVendida += qtd;
    }
    
    private void decrementaEstoque(Integer qtd){
        this.quantidade-=qtd;
    }
    
    public boolean vender(int qtd){
        
        if(qtd > this.getQuantidade()){
            System.out.println("Não Temos produtos Suficientes em estoque");
            Integer qtdDisponivel = (this.getQuantidade()-qtd);
            if(qtdDisponivel>0){
                System.out.println("Iremos Vender: "+qtdDisponivel+" de "+this.getNome());
                this.decrementaEstoque(qtdDisponivel);
                return true;
            }else{
                return false;
            }
        }else{
            System.out.println(qtd+" "+this.getNome()+"Vendidos");
            this.decrementaEstoque(qtd);
            return true;
        }
        
        
    }
    
    public Double getLucro(){
        return ((this.valorCompra*this.quantidade)-(this.valorVenda*this.quantidadeVendida));
    }
    
    

    
   
    
}
