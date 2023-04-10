package com.AndresDuarte;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        boolean continuar = true;

        System.out.println(" _____________________ ");
        System.out.println("|   Bienvenidx a la   |");
        System.out.println("|     Calculadora     |");
        System.out.println("|_____________________|");
        System.out.println("|  7  |  8  |  9 |  * |");
        System.out.println("|_____|_____|____|____|");
        System.out.println("|  4  |  5  |  6 |  / |");
        System.out.println("|_____|_____|____|____|");
        System.out.println("|  1  |  2  |  3 |  - |");
        System.out.println("|_____|_____|____|____|");
        System.out.println("|  0  |  .  |  = |  + |");
        System.out.println("|_____|_____|____|____|\n");

        
        while (continuar) {
            System.out.println("\nIngrese el primer numero: ");
            double numero1 = ingreso.nextDouble();
            
            System.out.println("Ingrese el segundo numero: ");
            double numero2 = ingreso.nextDouble();
            
            System.out.println("\nElija una operacion:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            int operacion = ingreso.nextInt();
            
            double resultado = 0;
                        
            switch (operacion) {
                case 1:
                    resultado = sumar(numero1, numero2);
                    break;
                case 2:
                    resultado = restar(numero1, numero2);
                    break;
                case 3:
                    resultado = multiplicar(numero1, numero2);
                    break;
                case 4:
                    resultado = dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Operacion invalida");
                    continue;
            }
            
            System.out.println("\nEl resultado es: "+resultado);
            
            System.out.println("\nDesea realizar otra operacion? (si/no)");
            String respuesta = ingreso.next();
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }
        
        System.out.println("\nGracias por utilizar nuestra calculadora.");
    }
    
    public static double sumar(double unNumero, double otroNumero) {
        return unNumero + otroNumero;
    }
    
    public static double restar(double unNumero, double otroNumero) {
        return unNumero - otroNumero;
    }
    
    public static double multiplicar(double unNumero, double otroNumero) {
        return unNumero * otroNumero;
    }
    
    public static double dividir(double unNumero, double otroNumero) {
        if (otroNumero == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return unNumero / otroNumero;
    }
}