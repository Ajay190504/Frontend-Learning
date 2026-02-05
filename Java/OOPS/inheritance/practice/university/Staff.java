package inheritance.practice.university;

class Staff extends University {
    String staffName;

    Staff(String uniName, String staffName) {
        super(uniName);
        this.staffName = staffName;
    }

    void showStaff() {
        showUni();
        System.out.println("Staff: " + staffName);
    }

    public static void main(String[] args) {
        Student s = new Student("SPPU Pune", "Ajay");
        s.showStudent();

        Professor p = new Professor("SPPU Pune", "Dr. Sharma");
        p.showProfessor();

        Staff st = new Staff("SPPU Pune", "Ramesh");
        st.showStaff();
    }
}