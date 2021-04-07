package edu.eci.asw.openweather.services;

import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;

public interface HttpConnectionService {
    JSONObject getWeatherByCity(String city) throws UnirestException;
}
