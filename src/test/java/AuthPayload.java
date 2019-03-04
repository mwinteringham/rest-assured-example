import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthPayload {

    @JsonProperty
    private String username;
    @JsonProperty
    private String password;

    public AuthPayload(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
