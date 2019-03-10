package pl.sda.jsondataset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Shows {

    private int id;
    private String url;
    private String name;
    private String type;
    private String language;
    private List<String> genres;
    private String status;
    private int runtime;
    private String premiered;
    private String officialSite;
    private Schedule schedule;
    private Rating rating;
    private int weight;
    private String network;
    private WebChannel webChannel;
    private Externals externals;
    private Image image;
    private String summary;
    private int updated;
    private Links links;
    private Embedded embedded;
}
