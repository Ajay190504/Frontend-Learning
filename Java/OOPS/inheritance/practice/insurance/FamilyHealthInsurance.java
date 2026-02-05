package inheritance.practice.insurance;

class FamilyHealthPlan extends HealthInsurance {
    int members;

    FamilyHealthPlan(String companyName, int coverage, int members) {
        super(companyName, coverage);
        this.members = members;
    }

    void showPlan() {
        showHealth();
        System.out.println("Members: " + members);
    }

    public static void main(String[] args) {
        FamilyHealthPlan f = new FamilyHealthPlan("LIC", 500000, 4);
        f.showPlan();
    }
}
