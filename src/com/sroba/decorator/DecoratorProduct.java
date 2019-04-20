package com.sroba.decorator;

import com.sroba.model.Product;
import com.sroba.product.IProduct;

public abstract class DecoratorProduct implements IProduct{
	
	protected IProduct decoratedProduct;
	
	
	public DecoratorProduct(IProduct decoratedProduct) {
		this.decoratedProduct = decoratedProduct;
	}

	@Override
	public void makeProduct(Product product) {
		this.decoratedProduct.makeProduct(product);
	}
}