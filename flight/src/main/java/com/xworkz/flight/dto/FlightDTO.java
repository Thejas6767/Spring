package com.xworkz.flight.dto;


import java.io.Serializable;

public class FlightDTO  {
    private String flightName;
    private String source;
    private String destination;

    public FlightDTO() {
        System.out.println("FlightDTO created");
    }

    public String getFlightName() { return flightName; }
    public void setFlightName(String flightName) { this.flightName = flightName; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    @Override
    public String toString() {
        return "FlightDTO [flightName=" + flightName + ", source=" + source + ", destination=" + destination + "]";
    }
}
