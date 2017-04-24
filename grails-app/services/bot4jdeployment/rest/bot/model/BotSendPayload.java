package bot4jdeployment.rest.bot.model;

/**
 * Created by Markus on 24.04.2017.
 */
public class BotSendPayload {
    private Long id;
    private String name;
    private String deploymentDestination;

    private FacebookSpecPayload facebookSpec;
    private SlackSpecPayload slackSpecPayload;
    private TelegramSpecPayload telegramSpecPayload;

    public BotSendPayload(Long id, String name, String deploymentDestination, FacebookSpecPayload facebookSpec, SlackSpecPayload slackSpecPayload, TelegramSpecPayload telegramSpecPayload) {
        this.id = id;
        this.name = name;
        this.deploymentDestination = deploymentDestination;
        this.facebookSpec = facebookSpec;
        this.slackSpecPayload = slackSpecPayload;
        this.telegramSpecPayload = telegramSpecPayload;
    }
}
