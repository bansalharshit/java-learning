
public class Product {
    private String name;
    private double price;
    private String location;
    private int quantity;

    public Product(String name, double price, String location, int quantity) {
        this.name = name;
        this.price = price;
        this.location = location;
        this.quantity = quantity;
    }
    public Product(){}

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", location='" + location + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
