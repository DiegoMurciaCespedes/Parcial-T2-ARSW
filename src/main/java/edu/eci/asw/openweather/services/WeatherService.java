package edu.eci.asw.openweather.services;

import java.io.IOException;

import com.mashape.unirest.http.exceptions.UnirestException;

import edu.eci.asw.openweather.model.CityWeather;

public interface WeatherService {
    CityWeather getWeatherByCity(String city) throws UnirestException, IOException;
}
