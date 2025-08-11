import java.time.LocalDate;

public class Transaction {

    private String type;  //(Purchase/Sale)
    private String person;  // Supplier/buyer(customer)
    private String product;
    private String location;
    private LocalDate date;

    public Transaction(String type, String person, String product, String location) {
        this.type = type;
        this.person = person;
        this.product = product;
        this.location = location;
        this.date = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", person='" + person + '\'' +
                ", product='" + product + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                '}';
    }
}
