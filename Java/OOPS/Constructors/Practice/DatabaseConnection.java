package constructors.practice;

class DatabaseConnection {
    DatabaseConnection() {
        System.out.println("Connecting to DB...");
    }

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
    }
}
