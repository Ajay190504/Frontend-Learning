package constructors.practice;

class Product {
    String name;

    private Product(String name) {
        this.name = name;
    }

    static Product createProduct(String name) {
        return new Product(name);
    }

    public static void main(String[] args) {
        Product p = Product.createProduct("Pen");
        System.out.println(p.name);
    }
}
