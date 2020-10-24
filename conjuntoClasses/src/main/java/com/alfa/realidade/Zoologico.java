package com.alfa.realidade;

import com.alfa.animais.Animal;

/**
 *
 * @author jovani
 */

public class Zoologico {
   
    public static void main(String[] args){
        Animal a = new Animal(50.0, "Mamífero", "Macho");
        a.imprimir();
       
        Animal b = new Animal(6.0, "Aves", "Femea");
        b.imprimir();
       
        Animal c = new Animal(30.0, "Reptil", "Macho");
        c.imprimir();
    }
   
}
 