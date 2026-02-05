package inheritance.practice.ecommerce;

class Mobile extends ElectronicProduct {
    int price;

    Mobile(String productName, String brand, int price) {
        super(productName, brand);
        this.price = price;
    }

    void showMobile() {
        showElectronic();
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Mobile m = new Mobile("Phone", "Samsung", 20000);
        m.showMobile();
    }
}
