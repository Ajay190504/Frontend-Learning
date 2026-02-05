package inheritance.practice.ecommerce;

class ElectronicProduct extends Product {
    String brand;

    ElectronicProduct(String productName, String brand) {
        super(productName);
        this.brand = brand;
    }

    void showElectronic() {
        showProduct();
        System.out.println("Brand: " + brand);
    }
}
