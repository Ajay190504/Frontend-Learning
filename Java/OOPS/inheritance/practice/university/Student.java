package inheritance.practice.university;

class Student extends University {
    String studentName;

    Student(String uniName, String studentName) {
        super(uniName);
        this.studentName = studentName;
    }

    void showStudent() {
        showUni();
        System.out.println("Student: " + studentName);
    }
}
