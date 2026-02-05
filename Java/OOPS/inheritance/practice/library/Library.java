package inheritance.practice.library;

class Library {
    String libraryName;

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    void showLibrary() {
        System.out.println("Library: " + libraryName);
    }
}