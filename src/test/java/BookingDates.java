
// "bookingdates": {
//     "checkin": "2018-11-23",
//     "checkout": "2018-12-03"
// },

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class BookingDates {

    @JsonProperty
    private Date checkin;
    @JsonProperty
    private Date checkout;

}
