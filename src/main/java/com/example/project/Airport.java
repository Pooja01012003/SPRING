package com.example.project;

public class Airport {
    private String name;
    private Location loc;
    private List<Flight> flights;

    public Airport(String name, Location loc, List<Flight> flights) {
        this.name = name;
        this.loc = loc;
        this.flights = flights;
    }

    public String getName() {
        return name;
    }

    public Location getLoc() {
        return loc;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
