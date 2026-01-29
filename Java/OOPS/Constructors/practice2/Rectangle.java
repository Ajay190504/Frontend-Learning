package constructors.practice2;

class Rectangle {
    int length, width;

    // Non-parameterized constructor
    Rectangle() {
        length = 10;
        width = 5;
    }

    // Parameterized constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.area();

        Rectangle r2 = new Rectangle(7, 4);
        r2.area();
    }
}

