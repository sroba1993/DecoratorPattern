package com.sroba.product.impl;

import com.sroba.model.Product;
import com.sroba.product.IProduct;

public class Shoes implements IProduct{

	@Override
	public void makeProduct(Product product) {
		System.out.println("Zapatos fabricados");
		System.out.println(product.toString());	
	}
}
