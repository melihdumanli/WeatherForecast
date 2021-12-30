package main.java.com.melih.common.geography;

import lombok.*;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Country {
    @BsonProperty(value = "country_name")
    private String name;
    @BsonProperty(value = "capital")
    private City capital;
    @BsonProperty(value = "telcode")
    private int telCode;
    @BsonProperty(value = "country_code")
    private String countryCode;
    @BsonProperty(value = "cities")
    private ArrayList<City> cities;
    @BsonProperty(value = "country_population")
    private long population;
}
