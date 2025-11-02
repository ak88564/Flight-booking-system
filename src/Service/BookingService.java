package Service;

import Dao.BookingDao;
import Dao.FlightsDao;
import Entity.Booking;
import Entity.City;
import Entity.Flights;
import Entity.Routes;

import java.util.HashMap;
import java.util.Map;

public class BookingService {

    private BookingDao bookingDao;

    private FlightsDao flightsDao;

    private Booking booking;

    public BookingService() {
        this.bookingDao = new BookingDao();
        this.flightsDao = new FlightsDao();
    }

    public void createFlight(String flightName){
        Flights flight = new Flights(flightName);
        String flightNumber = flight.getFlightNumber();
        System.out.println("Generated flight number: " + flightNumber);
//        Map<String, Flights> flightMap = new HashMap<>();
//        flightMap.put(flightNumber, flight);
//        flightsDao.setFlightMap(flightMap);
        flightsDao.getFlightMap().put(flightNumber, flight);
        System.out.println("Records inserted: " + flightsDao.getFlightMap().get(flightNumber));
        System.out.println("Flight created: " + flight.getFlightName() +
                "with flightNumber: " + flight.getFlightNumber());
    }

    public void createBooking(String flightName, City from, City to){
        String flightNumber = null;

        for(Map.Entry<String, Flights> entry : flightsDao.getFlightMap().entrySet()) {
            if (entry.getValue().getFlightName().equals(flightName)) {
                flightNumber = entry.getKey();
            }
        }

        if(flightNumber == null){
            System.out.println("Flight not found.");
            return;
        }
        Flights flight = flightsDao.getFlightMap().get(flightNumber);
        Routes route = new Routes(from, to);

        Booking booking = new Booking(flight, route);

        System.out.println("Booking created: " + booking);

    }


}
