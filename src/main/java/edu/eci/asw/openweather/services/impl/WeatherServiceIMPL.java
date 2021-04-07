package edu.eci.asw.openweather.services.impl;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.asw.openweather.model.CityWeather;
import edu.eci.asw.openweather.model.Coord;
import edu.eci.asw.openweather.model.Main;
import edu.eci.asw.openweather.model.Sys;
import edu.eci.asw.openweather.model.Weather;
import edu.eci.asw.openweather.model.Wind;
import edu.eci.asw.openweather.services.HttpConnectionService;
import edu.eci.asw.openweather.services.WeatherService;

@Service
public class WeatherServiceIMPL implements WeatherService {
    @Autowired
    HttpConnectionService httpConnectionService;

    public WeatherServiceIMPL() {

    }

    @Override
    public CityWeather getWeatherByCity(String city) throws UnirestException, IOException {
        JSONObject cityWeather = httpConnectionService.getWeatherByCity(city);
        
        JSONObject jsonObject = cityWeather.getJSONObject("coord");
        ObjectMapper mapper = new ObjectMapper();
        Coord coord = mapper.readValue(jsonObject.toString(), Coord.class);

        jsonObject = cityWeather.getJSONArray("weather").getJSONObject(0);
        Weather weather = mapper.readValue(jsonObject.toString(), Weather.class);

        String base = cityWeather.getString("base");

        jsonObject = cityWeather.getJSONObject("main");
        Main main = mapper.readValue(jsonObject.toString(), Main.class);

        int visibility = cityWeather.getInt("visibility");

        jsonObject = cityWeather.getJSONObject("wind");
        Wind wind = mapper.readValue(jsonObject.toString(), Wind.class);

        jsonObject = cityWeather.getJSONObject("clouds");
        int clouds = cityWeather.getJSONObject("clouds").getInt("all");

        Long dt = cityWeather.getLong("dt");

        jsonObject = cityWeather.getJSONObject("sys");
        Sys sys = mapper.readValue(jsonObject.toString(), Sys.class);

        int timezone = cityWeather.getInt("timezone");

        int id = cityWeather.getInt("id");

        String name = cityWeather.getString("name");

        return new CityWeather(coord, weather, base, main, visibility, wind, clouds, dt, sys, timezone, id, name);
    }
}
