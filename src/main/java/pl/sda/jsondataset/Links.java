package pl.sda.jsondataset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Links {
    private Self self;
    private Previousepisode previousepisode;
}
