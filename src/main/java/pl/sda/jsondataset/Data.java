package pl.sda.jsondataset;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    private String fall;
    private Geolocation geolocation;
    private String id;
    private String mass;
    private String name;
    private String nametype;
    private String recclass;
    private String reclat;
    private String reclong;
    private String year;
    private String computed_region_cbhk_fwbd;
    private String computed_region_nnqa_25f4;

}
