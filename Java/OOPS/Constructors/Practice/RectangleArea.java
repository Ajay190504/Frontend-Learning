package constructors.practice;

class RectangleArea {
    double length, breadth;

    public RectangleArea(int a, int b) {
    	length = a;
        breadth = b;
	}

    double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        RectangleArea r = new RectangleArea(10, 5);
        System.out.println("Area = " + r.area());
    }
}