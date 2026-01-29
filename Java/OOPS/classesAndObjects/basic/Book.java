package classesAndObjects.basic;

public class Book {

	String title;
	String author;
	int totalPages;
	int publishYear;
	String publisher;
	boolean isHardcover;
	int bookId;

	void openBook() {
		System.out.println(this.title + " is opened");
	}

	void readBook() {
		System.out.println("Reading the book: " + this.title);
	}

	void bookmarkPage() {
		System.out.println("Page bookmarked in " + this.title);
	}

	void closeBook() {
		System.out.println(this.title + " is closed");
	}

	void show() {
		System.out.println("Book Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Publisher: " + this.publisher);
		System.out.println("Total Pages: " + this.totalPages);
		System.out.println("Publish Year: " + this.publishYear);
		System.out.println("Book ID: " + this.bookId);
		System.out.println("Hardcover: " + this.isHardcover);
	}

	public static void main(String[] args) {

		Book bk1 = new Book();

		bk1.title = "Atomic Habits";
		bk1.author = "James Clear";
		bk1.publisher = "Penguin";
		bk1.totalPages = 320;
		bk1.publishYear = 2018;
		bk1.isHardcover = true;
		bk1.bookId = 101;

		bk1.openBook();
		bk1.readBook();
		bk1.bookmarkPage();
		bk1.closeBook();
		bk1.show();
	}
}

