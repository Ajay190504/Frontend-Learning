package constructors.practice;

class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James Gosling");
        System.out.println(b.title + " by " + b.author);
    }
}