class OrderDetail {
    private Product product;
    private int quantity;

    OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    Product getProduct() {
        return product;
    }

    void setProduct(Product product) {
        this.product = product;
    }
////
    int getQuantity() {
        return quantity;
    }
    void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}