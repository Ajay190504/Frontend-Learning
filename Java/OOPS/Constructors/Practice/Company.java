package constructors.practice;

class Company {
    String name;

    Company(String n) {
        name = n;
    }

    Company(Company c) {
        name = c.name;
    }

    public static void main(String[] args) {
        Company c1 = new Company("Infosys");
        Company c2 = new Company(c1);
        System.out.println(c2.name);
    }
}
