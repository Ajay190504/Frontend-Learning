package inheritance.practice.hrsystem;

class Company {
    String companyName;

    Company(String companyName) {
        this.companyName = companyName;
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
    }
}
