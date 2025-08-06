package com.onlinestore;

import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        System.out.println("Enter You Name as user name");
        String userName = sc.nextLine();
        User user = new User(userName);
        while(true)
        {
            System.out.println("\n1. View Products");
            System.out.println("\n2. Search Product by Id");
            System.out.println("\n3. Add to cart");
            System.out.println("\n4. View cart");
            System.out.println("\n5. Checkout");
            System.out.println("\n6. Exit");
            System.out.println("Choose an Option :");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                   store.displayProducts();
                    break;
                case 2:
                    System.out.println("Enter the Product Id");
                    int productId = sc.nextInt();
                    Product product = store.searchProduct(productId);
                    if(product!=null){
                        System.out.println(product);
                    }else
                        System.out.println("Product not Found");
                    break;
                case 3:
                    System.out.println("Enter Product Id for Adding into Cart");
                    int Id = sc.nextInt();
                    Product searchProduct = store.searchProduct(Id);
                    if(searchProduct!=null)
                        user.addToCart(searchProduct);
                    else
                        System.out.println("Product not Found");
                    break;
                case 4:
                    user.viewCart();
                    break;
                case 5:
                    System.out.println("Select Payment Method: 1.Card, 2.UPI, 3.Cash on Delivery");
                    int payChoice = sc.nextInt();
                    switch (payChoice)
                    {
                        case 1:
                            System.out.println("Enter the Credit/Debit Card Number");
                            user.checkout(sc.next());
                            break;
                        case 2:
                            System.out.println("Enter the UPI Id");
                            String upiId = sc.next();
                            System.out.println("Enter the UPI Pin");
                            String pin = sc.next();
                            user.checkout(upiId,pin);
                            break;
                        case 3:
                            user.checkout(true);
                            break;
                        default:
                            System.out.println("Invalid choice for payment");
                    }
                    break;
                case 6:
                    System.out.println("Thank You for Shopping....");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
