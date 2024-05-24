public class Customer extends Person {
    private int customerId;
    private int orderHistory;
}
public Customer(String Name, String Email, int customerId, int orderHistory) {
    super(Name, Email);
    this.customerId = customerId;
    this.orderHistory = orderHistory;
}

