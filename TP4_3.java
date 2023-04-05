package com.AndresDuarte;

import java.util.Scanner;

public class TP4_3 {
	Scanner dato = new Scanner(System.in);
		
	public void compraproducto() {
		
		Double totalPagar = 0.0;
		
		System.out.println("Ingrese el producto: ");
		String producto = dato.next();
		System.out.println("Ingrese el precio del producto: ");
		Double precio = dato.nextDouble();
		System.out.println("Ingrese la cantidad: ");
		int cantidad = dato.nextInt();
		
		Double total = precio*cantidad;
		System.out.println("El total es: "+total);
		
		if (total>1000) {
			System.out.println("El descuento es ; "+ total*0.20);
			totalPagar = total - (total*0.20);
			System.out.println("El neto a pagar es : "+totalPagar);
		}else {
			System.out.println("No hay descuentos");
		}
	}

	public void seccion() { 
		  
		String cliente;
		
		System.out.println("Ingreso su nombre: ");
		cliente = dato.next();
		  
		System.out.println("Ingrese la sección del producto: ");
	
		  
		System.out.println("Frutas");
		System.out.println("Lacteos");
		System.out.println("Gaseosas");
		String opcion = dato.next();
		
			switch(opcion) {
				case "Frutas":  compraproducto();
				break;
		  		case "Lacteos":  compraproducto();
		  		break;
		  		case "Gaseosas":  compraproducto();
		  		break;
		  		case "frutas":  compraproducto();
				break;
		  		case "lacteos":  compraproducto();
		  		break;
		  		case "gaseosas":  compraproducto();
		  		break;
		  	}
	}
	
	public static void main (String[] args) {
		  
		TP4_3 cp = new TP4_3();  
		  
		cp.seccion(); 
	} 
	
}
