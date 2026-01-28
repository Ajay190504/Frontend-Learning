package constructors.practice;

class CircleArea {
    double radius;

    CircleArea(double r) {
        radius = r;
    }

    void printArea() {
        System.out.println("Area = " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        CircleArea c = new CircleArea(7);
        c.printArea();
    }
}