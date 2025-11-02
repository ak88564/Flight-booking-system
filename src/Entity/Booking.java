package Entity;

import Utility.BookingIdGenerator;

public class Booking {
    private int bookingId;
    private Flights flight;
    private Routes route;

    public Booking(Flights flight, Routes route) {
        this.bookingId = BookingIdGenerator.getBookingId();
        this.flight = flight;
        this.route = route;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Flights getFlight() {
        return flight;
    }

    public void setFlight(Flights flight) {
        this.flight = flight;
    }

    public Routes getRoute() {
        return route;
    }

    public void setRoute(Routes route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", flight=" + flight +
                ", route=" + route +
                '}';
    }
}
