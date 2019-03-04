
// {
//     "firstname": "Susan",
//     "lastname": "Ericsson",
//     "totalprice": 378,
//     "depositpaid": true,
//     "bookingdates": {
//         "checkin": "2018-11-23",
//         "checkout": "2018-12-03"
//     },
//     "additionalneeds": "Breakfast"
// }

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingResponse {

    @JsonProperty
    private String firstname;
    @JsonProperty
    private String lastname;
    @JsonProperty
    private int totalprice;
    @JsonProperty
    private boolean depositpaid;
    @JsonProperty
    private BookingDates bookingdates;
    @JsonProperty
    private String additionalneeds;

    public String getAdditionalneeds() {
        return additionalneeds;
    }

}
