package com.sroba.product.impl;

import com.sroba.model.Product;
import com.sroba.product.IProduct;

public class Detergent implements IProduct {

	@Override
	public void makeProduct(Product product) {
		System.out.println("Detergente fabricado");
		System.out.println(product.toString());		
	}
}
