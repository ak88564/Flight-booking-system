package Utility;

public class BookingIdGenerator {
    private static int bookingId = 1;

    public static int getBookingId(){
        return bookingId++;
    }
}