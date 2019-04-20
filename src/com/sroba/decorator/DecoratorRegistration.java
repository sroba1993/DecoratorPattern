package com.sroba.decorator;

import com.sroba.model.Product;
import com.sroba.product.IProduct;

public class DecoratorRegistration extends DecoratorProduct{

	public DecoratorRegistration(IProduct decoratedProduct) {
		super(decoratedProduct);
	}
	
	@Override
	public void makeProduct(Product product) {
		decoratedProduct.makeProduct(product);
		registerMarkProduct(product);
	}
	
	private void registerMarkProduct(Product product) {
		System.out.println("Se registro el producto: " + product.getName());
	}
}
