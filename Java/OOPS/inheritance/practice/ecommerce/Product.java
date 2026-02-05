package inheritance.practice.ecommerce;

class Product {
    String productName;

    Product(String productName) {
        this.productName = productName;
    }

    void showProduct() {
        System.out.println("Product: " + productName);
    }
}
