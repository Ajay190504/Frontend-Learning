package inheritance.practice.hotel;

class LuxuryHotel extends Hotel {
    int stars;

    LuxuryHotel(String hotelName, int stars) {
        super(hotelName);
        this.stars = stars;
    }

    void showLuxury() {
        showHotel();
        System.out.println("Stars: " + stars);
    }

    public static void main(String[] args) {
        LuxuryHotel l = new LuxuryHotel("Taj Hotel", 5);
        l.showLuxury();
    }
}