package constructors.practice;

class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age < 18 ? 18 : age;
    }

    public static void main(String[] args) {
        User u = new User("Ajay", 15);
        System.out.println(u.age);
    }
}
