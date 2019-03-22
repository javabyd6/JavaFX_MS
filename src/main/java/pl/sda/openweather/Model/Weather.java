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
public class Weather {
    private Location location;
    private Current current;
}
