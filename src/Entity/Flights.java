package Entity;

public class Flights {
    private String flightName;
    private int flightNumber;

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
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
