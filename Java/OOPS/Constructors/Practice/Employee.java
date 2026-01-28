package constructors.practice;

class Employee {
    int id;
    String name;

    Employee() {
        id = 0;
        name = "Unknown";
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.id + " " + e.name);
    }
}