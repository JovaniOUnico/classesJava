/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.realidade;

import com.alfa.animais.Cachorro;
import com.alfa.animais.Poriferos;
import com.alfa.objeto.Caneta;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author jovani
 */
public class Criar {
  
     public static void main(String[] args){
      
        //primeira forma de testar log
        try {
            dasda();
        }catch(Exception ex) {
            Logger.getLogger(Criar.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        System.out.println("---Iniciando---");
        separador();
        testandoTudo();
        separador();
        System.out.println("---Finalizando---");
        
    }
    
    public static void testandoTudo(){
        
        Logger logger = Logger.getLogger("TesteDeInicio");
        logger.info("Iniciando Aplicação"); 
        logger.info("Testando Basicos");
        
        try{
            //Teste Basicco
            System.out.println("Testando");
                    
        }catch(Exception ex){
            logger.info("Fim Teste Basico");
        }
        separador();
        logger.info("Testando Objetos");
        try{
            //Testando Objetos
            Caneta aux = new Caneta("azul",900,"grossa");
            aux.desTampar();
            aux.escreva("Caneta Teste");
        }catch(Exception ex){
            logger.info("Fim Teste Cachorro");
        }
        
        
    }
    
    public static void separador(){
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("--------------------------------------");
    }
    
    
    
}
