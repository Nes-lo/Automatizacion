package co.devco.automatizacion.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Purchaser {

    public static final String PURCHASER_INFORMATION = "purchaser information";

    private final String name;
    private final String country;
    private final String city;
    private final String card;
    private final String month;
    private final String year;
    private final Credentials credentials;

}

/*
public class Purchaser {

    private final String name;
    private final String name;

    private final Credentials credentials;

    public Purchaser(String name, Credentials credentials) {
        this.name = name;
        this.credentials = credentials;
    }


    public String getName() {
        return name;
    }

    public Credentials withCredentials() {
        return credentials;
    }
}
*/