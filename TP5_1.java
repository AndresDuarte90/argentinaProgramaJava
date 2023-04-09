package com.AndresDuarte;

import java.util.Scanner;

class producto {
	String nproducto = "";
	String seccion = " ";
	double precio = 0;

}

class itemCarrito extends producto {
	Scanner ingreso = new Scanner(System.in);
	
	int cantidad=0;
	double subtotal;
		
	public void cargaProducto(String seccion, String nproducto, double precio, int cantidad, double subtotal) {
		
		System.out.println("--Ingrese la seccion donde desea comprar--");
		System.out.println("* Frutas");
		System.out.println("* Verduras");
		System.out.println("* Lacteos");
		System.out.println("* Bebidas");
		boolean seleccionSeccion=false;
		
		do {
			seccion = ingreso.next();
			switch (seccion.toLowerCase()) {
			case "frutas": seccionFrutas();
			seleccionSeccion=true;
			break;
			case "verduras": seccionVerduras();
			seleccionSeccion=true;
			break;
			case "lacteos": seccionLacteos();
			seleccionSeccion=true;
			break;
			case "bebidas": seccionBebidas();
			seleccionSeccion=true;
			break;
			default: System.out.println("Seccion incorrecta, por favor intentelo de nuevo.");
			break;
			}
		}while(!seleccionSeccion);
		
		System.out.println("Ingrese el precio: ");
		this.precio = ingreso.nextDouble();
		System.out.println("Ingrese la cantidad: ");
		this.cantidad = ingreso.nextInt();
		this.subtotal=calculoSubtotal();
		
		System.out.println("El subtotal es: $" + this.subtotal);

	}
		
	private double calculoSubtotal() {
		return precio*cantidad;
	}

	public void seccionFrutas() {
		System.out.println("--Seleccione el producto: ");
		System.out.println("* Naranja");
		System.out.println("* Manzana");
		System.out.println("* Banana");
		System.out.println("* Pera");
		this.nproducto = ingreso.next();
	}
	public void seccionVerduras() {
		System.out.println("--Seleccione el producto: ");
		System.out.println("* Acelga");
		System.out.println("* Papa");
		System.out.println("* Zanahoria");
		System.out.println("* Cebolla");
		this.nproducto = ingreso.next();
	}
	public void seccionLacteos() {
		System.out.println("--Seleccione el producto: ");
		System.out.println("* Leche");
		System.out.println("* Queso");
		System.out.println("* Crema de leche");
		System.out.println("* Yogurt");
		this.nproducto = ingreso.next();
	}
	public void seccionBebidas() {
		System.out.println("--Seleccione el producto: ");
		System.out.println("* Agua");
		System.out.println("* Gaseosa");
		System.out.println("* Aperitivos");
		System.out.println("* Cerveza");
		this.nproducto = ingreso.next();
	}
}

class carrito {
	itemCarrito itemCarrito1 = new itemCarrito();
	itemCarrito itemCarrito2 = new itemCarrito();
	itemCarrito itemCarrito3 = new itemCarrito();
	
	public void inicializarCarrito() {
		itemCarrito1.cargaProducto("","",0,0,0);
		itemCarrito2.cargaProducto("","",0,0,0);
		itemCarrito3.cargaProducto("","",0,0,0);
	}
	
	double descuento;
	
	public double Descuento() {
		if ((itemCarrito1.subtotal+itemCarrito2.subtotal+itemCarrito3.subtotal)>1000) {
			descuento=(itemCarrito1.subtotal+itemCarrito2.subtotal+itemCarrito3.subtotal)*0.15;
		}
		return descuento;
	}
	public double total() {
		return itemCarrito1.subtotal+itemCarrito2.subtotal+itemCarrito3.subtotal;
	}
	
	public double totalPagar() {
		return (itemCarrito1.subtotal+itemCarrito2.subtotal+itemCarrito3.subtotal)-descuento;
	}
}


public class TP5_1 {

	// Implemente usted mismo para un “carrito de compras”:
	// + una clase Producto (que pueda tener hasta 3 items),
	// + otra ItemCarrito
	// + otra Carrito
	// + otra Descuento.
	

	public static void main(String[] args) {
		
		System.out.println("---------------------------------------");
		System.out.println("---BIENVENIDO A SU CARRITO DE COMPRA---");
		System.out.println("---------------------------------------");
		
		carrito carrito1 = new carrito();
		carrito1.inicializarCarrito();
		
		System.out.printf("%-10s %-15s %-10s %-10s\n", "Cantidad", "Producto", "Precio", "Subtotal");
		System.out.printf("%-10s %-15s $%-9.2f $%-9.2f\n", carrito1.itemCarrito1.cantidad, carrito1.itemCarrito1.nproducto, carrito1.itemCarrito1.precio, carrito1.itemCarrito1.subtotal);
		System.out.printf("%-10s %-15s $%-9.2f $%-9.2f\n", carrito1.itemCarrito2.cantidad, carrito1.itemCarrito2.nproducto, carrito1.itemCarrito2.precio, carrito1.itemCarrito2.subtotal);
		System.out.printf("%-10s %-15s $%-9.2f $%-9.2f\n", carrito1.itemCarrito3.cantidad, carrito1.itemCarrito3.nproducto, carrito1.itemCarrito3.precio, carrito1.itemCarrito3.subtotal);
		System.out.printf("%-10s %-15s %-10s $%-9.2f\n", "", "", "Subtotal", carrito1.total());
		System.out.printf("%-10s %-15s %-10s $%-9.2f\n", "", "", "Descuento", carrito1.Descuento());
		System.out.printf("%-10s %-15s %-10s $%-9.2f\n", "", "", "Total", carrito1.totalPagar());

		
	}	
}
