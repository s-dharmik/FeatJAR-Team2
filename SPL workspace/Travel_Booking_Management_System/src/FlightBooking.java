class FlightBooking {
    private String bookingId;
    private String passengerName;

    FlightBooking(String bookingId, String passengerName) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", passengerName='" + passengerName + '\'' +
                '}';
    }
}
