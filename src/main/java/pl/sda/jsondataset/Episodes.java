package pl.sda.jsondataset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Episodes {
    private int id;
    private String url;
    private String name;
    private int season;
    private int number;
    private String airdate;
    private String airtime;
    private String airstamp;
    private int runtime;
    private Image image;
    private String summary;
    private Links links;
}
