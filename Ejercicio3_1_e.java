/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.ejercicio3;

/**
 *
 * @author wolvy
 */
public class Ejercicio3_1_e {
    
    public static void main(String[] args) {
        
        int notasPrimeroA[] = new int []{6,7,9,5,7,8};
        int notasPrimeroB[] = new int []{5,7,7,3,1,9};
        int notasPrimeroC[] = new int []{7,7,9,8,7,10};
        
        int sumatoriaA=0;
        int sumatoriaB=0;
        int sumatoriaC=0;
        
        for (int i=0;i<notasPrimeroA.length;i++){
            sumatoriaA = sumatoriaA+notasPrimeroA[i];
        }
                
        for (int i=0;i<notasPrimeroB.length;i++){
            sumatoriaB = sumatoriaB+notasPrimeroB[i];
        }
                
        for (int i=0;i<notasPrimeroC.length;i++){
            sumatoriaC = sumatoriaC+notasPrimeroC[i];
        }
        
        int sumatoriaTotal=sumatoriaA+sumatoriaB+sumatoriaC;
        int cantidadAlumnos=notasPrimeroA.length+notasPrimeroB.length+notasPrimeroC.length;
        
        int promedioTotal=sumatoriaTotal/cantidadAlumnos;
        
        System.out.println(promedioTotal);
        
    }
}
