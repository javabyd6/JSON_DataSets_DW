package pl.sda.jsondataset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Geolocation {
    private String type;
    private List<Double> coordinates;
}
