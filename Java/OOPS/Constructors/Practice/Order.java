package constructors.practice;

class Order {
    static int counter = 1000;
    int orderId;

    Order() {
        orderId = ++counter;
    }

    public static void main(String[] args) {
        Order o1 = new Order();
        Order o2 = new Order();
        System.out.println(o1.orderId + " " + o2.orderId);
    }
}
