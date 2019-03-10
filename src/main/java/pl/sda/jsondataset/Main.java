package pl.sda.jsondataset;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper ();
        Shows data =mapper.readValue (new File ("eartquake.json"),Shows.class);

       /* System.out.println (data.length);
        for (Shows e: data
             ) {
            System.out.println (e.toString ());*/
        }
    }

