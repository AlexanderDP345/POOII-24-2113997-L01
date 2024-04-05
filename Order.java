import java.util.ArrayList;
import java.util.List;
class Order {
    private int orderId;
    private List<OrderDetail> orderDetails;
    private Payment payment;

    Order(int orderId) {
        this.orderId = orderId;
        this.orderDetails = new ArrayList<>();
    }

/////////////////////
    int getOrderId() {
        return orderId;
    }

    void setOrderId(int orderId) {
        this.orderId = orderId;
    }

//(revisar)
    void addOrderDetail(OrderDetail orderDetail) {
        orderDetails.add(orderDetail);
    }

    List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }


    Payment getPayment() {
        return payment;
    }

    void setPayment(Payment payment) {
        this.payment = payment;
    }
}