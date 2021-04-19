package com.company;

public class ProductManager {
    public void Add(Product product){
        //jdbc kodları gelicek kısım
        System.out.println("Ürün Eklendi ; " + product.getId() + " : " + product.getName()+ " : " +product.getKod());
    }
}
