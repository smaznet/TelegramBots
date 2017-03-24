package org.telegram.telegrambots.api.objects;



import org.telegram.telegrambots.api.interfaces.BotApiObject;

/**
 * @author Ruben Bermudez
 * @version 1.0
 * @brief This object represents a venue.
 * @date 10 of April of 2016
 */
public class Venue implements BotApiObject {
    private static final String LOCATION_FIELD = "location";
    private static final String TITLE_FIELD = "title";
    private static final String ADDRESS_FIELD = "address";
    private static final String FOURSQUARE_ID_FIELD = "foursquare_id";


    private Location location; ///< Venue location

    private String title; ///< Name of the venue

    private String address; ///< Address of the venue

    private String foursquare_id; ///< Optional. Foursquare identifier of the venue

    public Venue() {
        super();
    }

    public Location getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getFoursquareId() {
        return foursquare_id;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "location=" + location +
                ", title=" + title +
                ", address=" + address +
                ", foursquareId=" + foursquare_id +
                '}';
    }
}
