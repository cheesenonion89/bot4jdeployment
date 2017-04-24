package bot4jdeployment.rest.bot.model;

/**
 * Created by Markus on 24.04.2017.
 */
public class FacebookSpecPayload {

    String platformName = "Facebook";

    String accessToken;

    public FacebookSpecPayload(String accessToken) {
        this.accessToken = accessToken;
    }
}
