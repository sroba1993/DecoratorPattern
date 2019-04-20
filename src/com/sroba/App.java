package com.sroba;

import com.sroba.decorator.DecoratorRegistration;
import com.sroba.model.Product;
import com.sroba.product.IProduct;
import com.sroba.product.impl.Detergent;
import com.sroba.product.impl.Shoes;

public class App {

	public static void main(String[] args) {
		//crear producto único sin marca registrada
		Product product = new Product("Nike 360", "Zapatos", "Nike", 300_000);
		IProduct shoes = new Shoes();
		shoes.makeProduct(product);
		
		System.out.println("----------------------------------------------");
		
		//crear producto con marca registrada, sin tener que agregarle el atributo
		//a la clase modelo original, se utiliza el decorador hecho
		Product product2 = new Product("Fab total", "Detergente hogar", "Fab", 20_000);
		IProduct detergent = new Detergent();
		IProduct registeredDetergent = new DecoratorRegistration(detergent);
		
		registeredDetergent.makeProduct(product2);
	}
}
