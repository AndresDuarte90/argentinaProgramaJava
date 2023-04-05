
package com.AndresDuarte;

import java.util.Scanner;

public class TP4_2 {
    public static void main(String[] args) {
        
    	Scanner lectura = new Scanner(System.in);
    	
        System.out.println("Ingrese su nombre y apellido:");
        String nombre = lectura.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = lectura.nextInt();
        
        System.out.println("Datos Usuario -- "+"Nombre y apellido:"+nombre+" - Edad:"+edad);
        
        if (edad>18){
            System.out.println("El usuario es mayor de edad");
        }else{
            System.out.println("El usuario es menor de edad");
        }
        
    }
    
}
