package edu.eci.asw.openweather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.asw.openweather.services.WeatherService;

@RestController
public class WeatherController {
    @Autowired
    WeatherService weatherService;

    @RequestMapping(value = "weather/{city}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeatherByCity(@PathVariable(name="city") String city) {
        try {
            return new ResponseEntity<>(weatherService.getWeatherByCity(city), HttpStatus.ACCEPTED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al buscar ciudad", HttpStatus.BAD_REQUEST);
        }
    }
}
