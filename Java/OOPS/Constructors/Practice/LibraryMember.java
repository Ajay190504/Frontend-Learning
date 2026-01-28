package constructors.practice;


class LibraryMember {
    String name;
    String type;

    LibraryMember(String name, int booksIssued) {
        this.name = name;
        this.type = booksIssued > 5 ? "Premium" : "Standard";
    }

    public static void main(String[] args) {
        LibraryMember m = new LibraryMember("Ajay", 7);
        System.out.println(m.type);
    }
}
