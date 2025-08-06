package com.onlinestore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();
    public Store()
    {
        // Pre loaded Products
        products.add(new Electronics(1,"Laptop",55000,"Dell",2));
        products.add(new Electronics(2,"Mobile",25000,"Samsung",1));
        products.add(new Clothing(3,"T-Shirt",700.00,"L","Cotton"));
        products.add(new Clothing(4,"Jeans",1000.00,"32","Denim"));
    }
    public void displayProducts()
    {
        System.out.println("Available Products List ");
        for(Product p : products)
            System.out.println(p);
    }
    public Product searchProduct(int id)
    {
        for(Product p:products)
        {
            if(p.getId()==id)
            {
                return p;
            }
        }
        return null;
    }
}
