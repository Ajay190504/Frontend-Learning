package inheritance.practice.university;


class Professor extends University {
    String profName;

    Professor(String uniName, String profName) {
        super(uniName);
        this.profName = profName;
    }

    void showProfessor() {
        showUni();
        System.out.println("Professor: " + profName);
    }
}