package bot4jdeployment

class BootStrap {

    def init = { servletContext ->


        def bot1 = new Bot(name: 'ConfiguredBot', deploymentDestination: 'http://test.destinati.on/testBot').save()
        def fbSpec = new FacebookSpec(
                bot: bot1,
                accessToken: 'facebook_token').save()
        def slackSpec = new SlackSpec(
                bot: bot1,
                accessToken: 'slack_token',
                clientId: 'slack_client',
                clientSecret: 'slack_secret',
                userName: 'slack_user'
        ).save()
        def telegramSpec = new TelegramSpec(
                bot: bot1,
                accessToken: 'telegram_token',
                webhookUrl: 'telegram_webhook'
        ).save()
        //bot.addToPlatformSpecs(fbSpec)

        new Bot(name: 'UnconfiguredBot', deploymentDestination: 'http://test.destinati.on/testBot').save()
    }
    def destroy = {
    }
}
