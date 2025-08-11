import java.util.*;

public class InventoryManager {
    private Map<String,Product> inventory = new HashMap<>();
    private Set<String> productNames = new HashSet<>();
    private List<Product> newArrival = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    public void addProduct(Product product,Transaction transaction)
    {
        if(productNames.contains(product.getName()))
        {
            System.out.println("Product already existing.updating quantity...");
            Product existing = inventory.get(product.getName());
            int newQuantity = existing.getQuantity()+product.getQuantity();
            inventory.put(product.getName(),new Product(existing.getName(),existing.getPrice(),existing.getLocation(),existing.getQuantity()));
        }else{
            inventory.put(product.getName(),product);
            productNames.add(product.getName());
            newArrival.add(product);
        }
        transactions.add(transaction);
    }

    public void displayInventory()
    {
        System.out.println("=======Inventory======");
        for(Product product:inventory.values())
            System.out.println(product);
    }

    public void displayNewArrivals()
    {
        System.out.println("====New Arrivals====");
        for(Product p:newArrival)
            System.out.println(p);
    }

    public void displayTransactions()
    {
        System.out.println("====Transactions====");
        for(Transaction transaction:transactions)
            System.out.println(transaction);
    }

    public void displayProductsSortByName()
    {
        List<Product> sorted = new ArrayList<>(inventory.values());
        Collections.sort(sorted,new ProductNameComparator());
        sorted.forEach(System.out::println);
    }

    public void displayProductsSortByPrice()
    {
        List<Product> sorted = new ArrayList<>(inventory.values());
        Collections.sort(sorted,new ProductPriceComparator());
        sorted.forEach(System.out::println);
    }

}
