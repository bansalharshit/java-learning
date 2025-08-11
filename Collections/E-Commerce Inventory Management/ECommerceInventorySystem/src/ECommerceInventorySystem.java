import java.util.Scanner;

public class ECommerceInventorySystem {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- E-Commerce Inventory Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Display Inventory");
            System.out.println("3. Display New Arrivals");
            System.out.println("4. Display Transactions");
            System.out.println("5. Sort by Name");
            System.out.println("6. Sort by Price");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter location: ");
                    String location = sc.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Transaction Type (Purchase/Sale): ");
                    String type = sc.nextLine();
                    System.out.print("Person (Supplier/Buyer Name): ");
                    String person = sc.nextLine();

                    Product p = new Product(name, price, location, qty);
                    Transaction t = new Transaction(type, person, name, location);
                    manager.addProduct(p, t);
                    break;

                case 2:
                    manager.displayInventory();
                    break;
                case 3:
                    manager.displayNewArrivals();
                    break;
                case 4:
                    manager.displayTransactions();
                    break;
                case 5:
                    manager.displayProductsSortByName();
                    break;
                case 6:
                    manager.displayProductsSortByPrice();
                    break;
                case 7:
                    System.out.println("Exiting...");
                return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
