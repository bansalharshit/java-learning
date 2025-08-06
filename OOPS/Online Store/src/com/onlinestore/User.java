package com.onlinestore;

public class User {
    private String name;
    private Cart cart;

    public User(String name) {
        this.name = name;
        this.cart = new Cart();
    }

    public String getName() {
        return name;
    }

    public Cart getCart() {
        return cart;
    }

    public void addToCart(Product product)
    {
        cart.addProduct(product);
    }
    public void viewCart()
    {
        cart.viewCart();
    }

    // Overloaded Checkout Methods
    public void checkout(String creditCardNumber){
       processPayment("Credit/Debit card",creditCardNumber);
    }
    public void checkout(String upiId, String pin){
        processPayment("UPI",pin);
    }
    public void checkout(boolean cashOnDelivery){
        processPayment("Cash on Delivery","COD");
    }
    public void processPayment(String method, String details)
    {
        if(cart.isEmpty())
        {
            System.out.println("cart is Empty, You can not Checkout");
            return;
        }
        double total = cart.calculateTotal();
        System.out.println("Processing payment of Rs "+ total + " via "+ method + '(' + details + ')');
        System.out.println("Payment Successful! Order has been placed");
        cart.clearCart();
    }
}
