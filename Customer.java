import java.util.ArrayList;
import java.util.List;
class Customer {
    private String name;
    private List<Order> orders;

    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }


    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void addOrder(Order order) {
        orders.add(order);
    }

    List<Order> getOrders() {
        return orders;
    }
}