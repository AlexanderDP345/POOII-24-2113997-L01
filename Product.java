class Product {
    private int productId;
    private String productName;
    private double price;
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    int getProductId() {
        return productId;
    }

    void setProductId(int productId) {
        this.productId = productId;
    }

    String getProductName() {
        return productName;
    }


   //////////
void setProductName(String productName) {
this.productName = productName;
    }
//////////////
    double getPrice() {
        return price;
    }
    void setPrice(double price) {
        this.price = price;
    }
}