import java.util.ArrayList;
import java.util.List;



////////////////////////////
// a) Customer - Order: Asociación
// b) Order - OrderDetail: Composición
// c) OrderDetail - Product: Asociación
// d) Order - Payment: Asociación
// e) Payment - Cash: Herencia
// f) Payment - Check: Herencia
// g) Payment - CreditCard: Herencia
////////////////////////////
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Kevin");

        Product product1 = new Product(1, "Product A", 10.99);
        Product product2 = new Product(3, "Product B", 20.49);



        ////

        ///////////////////////
        List<OrderDetail> orderDetails = new ArrayList<>();
        orderDetails.add(new OrderDetail(product1, 2));
        orderDetails.add(new OrderDetail(product2, 1));
        Order order1 = new Order(1);
        order1.addOrderDetail(orderDetails.get(0));
        order1.addOrderDetail(orderDetails.get(1));

//
customer1.addOrder(order1);

System.out.println("Cliente: " + customer1.getName());
List<Order> orders = customer1.getOrders();
for (Order order : orders) {
System.out.println("Orden ID: " + order.getOrderId());
List<OrderDetail> details = order.getOrderDetails();
for (OrderDetail detail : details) {
 System.out.println("Producto: " + detail.getProduct().getProductName() +
", Cantidad: " + detail.getQuantity());
           }
 }
 Payment payment = new Cash();
order1.setPayment(payment);
 payment.calculateTotalAmount();
    }
}