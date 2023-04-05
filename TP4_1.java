package com.AndresDuarte;

import java.util.Scanner;

public class TP4_1 {
    
    public static void main(String[] args){
    	
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre y apellido:");
        String nombre = lectura.nextLine();

        System.out.println("Ingrese su edad:");
		int edad = lectura.nextInt();
        
        System.out.println("Datos Usuario -- "+"Nombre y apellido:"+nombre+" - Edad:"+edad);
        
    }
     
}
