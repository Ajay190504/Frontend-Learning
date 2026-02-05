package inheritance.practice.insurance;

class HealthInsurance extends Insurance {
    int coverage;

    HealthInsurance(String companyName, int coverage) {
        super(companyName);
        this.coverage = coverage;
    }

    void showHealth() {
        showInsurance();
        System.out.println("Coverage: " + coverage);
    }
}