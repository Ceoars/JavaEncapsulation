package com.company;

public class Main {

    public static void main(String[] args) {
	    Product product=new Product();
	    product.setName("Laptop");
	    product.setDescription("12 gb ram,2.56 Ghz,256 gb ssd");
	    product.setId(1);
	    product.setPrice(1200);
	    product.setStockAmount(3);

	    ProductManager productManager = new ProductManager();
	    productManager.Add(product);
    }
}
