package Dao;

import Entity.Flights;

import java.util.HashMap;
import java.util.Map;

public class FlightsDao {
    private Map<String, Flights> flightMap;

    public FlightsDao() {
        this.flightMap = new HashMap<>();
    }

    public Map<String, Flights> getFlightMap() {
        return flightMap;
    }

    public void setFlightMap(Map<String, Flights> flightMap) {
        this.flightMap = flightMap;
    }
}
