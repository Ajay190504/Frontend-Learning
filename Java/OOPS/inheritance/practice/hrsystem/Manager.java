package inheritance.practice.hrsystem;

class Manager extends Company {
    String managerName;

    Manager(String companyName, String managerName) {
        super(companyName);
        this.managerName = managerName;
    }

    void showManager() {
        showCompany();
        System.out.println("Manager: " + managerName);
    }

    public static void main(String[] args) {
        Manager m = new Manager("Infosys", "Ajay Waghmare");
        m.showManager();
    }
}