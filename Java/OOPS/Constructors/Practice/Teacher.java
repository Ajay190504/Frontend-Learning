package constructors.practice;

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma");
        System.out.println(t.name);
    }
}
