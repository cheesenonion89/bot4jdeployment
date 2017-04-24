package bot4jdeployment.rest.bot.model;

/**
 * Created by Markus on 24.04.2017.
 */
public class TelegramSpecPayload {

    String platformName = "Telegram";

    String accessToken;
    String webhookUrl;

    public TelegramSpecPayload(String accessToken, String webhookUrl) {
        this.accessToken = accessToken;
        this.webhookUrl = webhookUrl;
    }
}
