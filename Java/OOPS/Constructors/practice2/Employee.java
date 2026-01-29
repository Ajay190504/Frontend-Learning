package constructors.practice2;

class Employee {
    int id;
    String name;
    double salary;

    // Parameterized constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ajay", 55000);
        Employee e2 = new Employee(2, "Sujay", 55000);

        e1.display();
        e2.display();
    }
}

