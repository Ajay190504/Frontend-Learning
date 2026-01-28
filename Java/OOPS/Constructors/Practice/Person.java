package constructors.practice;

class Person {
    String name;
    int age;

    Person(String name) {
        this.name = name;
        this.age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ajay");
        Person p2 = new Person("Ajay", 21);
        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);
    }
}
