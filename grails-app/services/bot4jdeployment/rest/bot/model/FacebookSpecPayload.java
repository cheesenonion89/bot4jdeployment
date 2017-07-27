package bot4jdeployment.rest.bot.model;

/*
 * Domain class to hold information about the Facebook configuration of a bot. Is always sent together with a bot.
 */
public class FacebookSpecPayload {

    String platformName = "Facebook";

    String accessToken;

    public FacebookSpecPayload(String accessToken) {
        this.accessToken = accessToken;
    }
}
