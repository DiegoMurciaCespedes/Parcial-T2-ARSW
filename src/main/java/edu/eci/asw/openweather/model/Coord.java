package edu.eci.asw.openweather.model;

import java.io.Serializable;

public class Coord implements Serializable {
    private double lon, lat;

    public Coord(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Coord () {
        
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
