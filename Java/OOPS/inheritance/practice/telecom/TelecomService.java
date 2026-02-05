package inheritance.practice.telecom;

class TelecomService {
    String name;

    TelecomService(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Service: " + name);
    }
}