package pl.sda.openweather.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.Model.Weather;
import java.io.IOException;
import java.net.URL;

/**
 * @author marek swietlik
 */
public class WeatherService {
    private String finalURL;

    public WeatherService(String urlAddress, String apiKey) {
        finalURL = urlAddress + "?key=" + apiKey + "&q=";
    }

    public Weather getCityWeather(String city) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        URL url = new URL(finalURL + city);
        return mapper.readValue(url, Weather.class);

    }
}
