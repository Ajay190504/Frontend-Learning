package constructors.practice2;

class Student {
    int id;
    String name;

    // Non-parameterized constructor
    Student() {
        System.out.println("Welcome Student");
    }

    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Ajay");
        s2.display();
    }
}

