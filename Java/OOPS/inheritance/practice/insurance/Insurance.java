package inheritance.practice.insurance;

class Insurance {
    String companyName;

    Insurance(String companyName) {
        this.companyName = companyName;
    }

    void showInsurance() {
        System.out.println("Company: " + companyName);
    }
}
