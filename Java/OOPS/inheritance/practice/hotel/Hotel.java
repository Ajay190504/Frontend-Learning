package inheritance.practice.hotel;

class Hotel {
    String hotelName;

    Hotel(String hotelName) {
        this.hotelName = hotelName;
    }

    void showHotel() {
        System.out.println("Hotel: " + hotelName);
    }
}

