/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.ejercicio3;


/**
 *
 * @author wolvy
 */
public class Ejercicio3_1_d {
    
    public static void main(String[] args) {
        
        String items = "zapatillaNike;remeraAdidas;mediasAdidas;bolsoNike";
        
        String[] mercaderia = items.split(";");
        int precio[] = new int []{23000,5500,3200,12700};
        
        for (int i=0;i<4;i++){
            System.out.println("Producto: "+mercaderia[i]+" Precio: "+precio[i]);
        }
    }
}


