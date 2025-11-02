package Entity;

import java.util.UUID;

public class Flights {
    private String flightName;
    private String flightNumber;

    public Flights(String flightName) {
        this.flightName = flightName;
        this.flightNumber = UUID.randomUUID().toString().substring(0, 7);
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flightName='" + flightName + '\'' +
                ", flightNumber=" + flightNumber +
                '}';
    }
}
