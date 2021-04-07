package edu.eci.asw.openweather.model;

public class CityWeather {
    private Coord coord;
    private Weather weather;
    private String base;
    private Main main;
    private int visibility, clouds, timezone, id;
    private Wind wind;
    private long dt;
    private Sys sys;
    private String name;

    public CityWeather(Coord coord, Weather weather, String base, Main main, int visibility, Wind wind, int clouds, long dt, Sys sys, int timezone, int id, String name) {
        this.setCoord(coord);
        this.setWeather(weather);
        this.setBase(base);
        this.setMain(main);
        this.setVisibility(visibility);
        this.setWind(wind);
        this.setClouds(clouds);
        this.setDt(dt);
        this.setSys(sys);
        this.setTimezone(timezone);
        this.setId(id);
        this.setName(name);
	}

    public CityWeather() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }
}
