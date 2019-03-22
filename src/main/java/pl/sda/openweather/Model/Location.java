package pl.sda.openweather.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author marek swietlik
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    private String name;
    private String region;
    private String country;
    private float lat;
    private float lon;
    private String tz_id;
    private Integer localtime_epoch;
    private String localtime;
}
