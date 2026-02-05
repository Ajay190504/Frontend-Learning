package inheritance.practice.library;

class Section extends Library {
    String sectionName;

    Section(String libraryName, String sectionName) {
        super(libraryName);
        this.sectionName = sectionName;
    }

    void showSection() {
        showLibrary();
        System.out.println("Section: " + sectionName);
    }
}

