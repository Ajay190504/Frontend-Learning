package inheritance.practice.library;

class Book extends Section {
    String bookName;

    Book(String libraryName, String sectionName, String bookName) {
        super(libraryName, sectionName);
        this.bookName = bookName;
    }

    void showBook() {
        showSection();
        System.out.println("Book: " + bookName);
    }

    public static void main(String[] args) {
        Book b = new Book("City Library", "CS", "Java Basics");
        b.showBook();
    }
}
