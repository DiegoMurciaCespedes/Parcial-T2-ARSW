package edu.eci.asw.openweather.services.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import edu.eci.asw.openweather.services.HttpConnectionService;

@Service
public class HttpConnectionServiceIMPL implements HttpConnectionService {
    public HttpConnectionServiceIMPL() {
        
    }

    @Override
    public JSONObject getWeatherByCity(String city) throws UnirestException {
        HttpResponse<String> httpResponse = Unirest.get("http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=e628c368c1c5532a4149b93c361ab853").asString();

        return new JSONObject(httpResponse.getBody());
    }
}
