package Dao;

import Entity.Booking;

import java.util.HashMap;
import java.util.Map;

public class BookingDao {

    private Map<Integer, Booking> bookingMap;

    public BookingDao() {
        this.bookingMap = new HashMap<>();
    }

    public Map<Integer, Booking> getBookingMap() {
        return bookingMap;
    }

    public void setBookingMap(Map<Integer, Booking> bookingMap) {
        this.bookingMap = bookingMap;
    }
}
