package io.szjug.mdbsd.domain;

import java.util.List;
import org.springframework.data.annotation.Id;

/**
 * Created by Paul on 1/20/2016.
 */
public class Country {

    @Id
    private String id;


    String name;

    Float gdp;

    List<Country> tradePartners;

}
