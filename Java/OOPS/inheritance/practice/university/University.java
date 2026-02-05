package inheritance.practice.university;

class University {
    String uniName;

    University(String uniName) {
        this.uniName = uniName;
    }

    void showUni() {
        System.out.println("University: " + uniName);
    }
}