package com.onlinestore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    public Cart()
    {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product)
    {
        products.add(product);
        System.out.println(product.getName()+ " added to cart. ");
    }
    public void removeProduct(int productid)
    {
        for(Product p:products)
        {
            if(p.getId() == productid)
            {
                products.remove(p);
                System.out.println(p.getName()+ " removed from cart. ");
                return;
            }
        }
        System.out.println("Product not found in the cart.");
    }
public List<Product> viewAllProducts()
{
    return products;
}
public void viewCart()
{
    if(products.isEmpty())
    {
        System.out.println("Cart is Empty. ");
        return;
    }
    System.out.println("Items in the Cart");
    for(Product p: products)
    {
        System.out.println(p);
    }
    System.out.println("Total Amount: "+calculateTotal());
}
public double calculateTotal()
{
    double totalPrice = 0.00;
    for(Product p:products)
        totalPrice+=p.getPrice();
    return totalPrice;
}
public void clearCart()
{
    products.clear();
}
public boolean isEmpty()
{
    return products.isEmpty();
}

}
