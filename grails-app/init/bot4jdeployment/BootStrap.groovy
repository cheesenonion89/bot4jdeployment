package bot4jdeployment

class BootStrap {

    def init = { servletContext ->


        def bot1 = new Bot(name: 'ConfiguredBot', deploymentDestination: 'http://test.destinati.on/testBot',botType: "InceptionBot").save()
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

        new Bot(name: 'UnconfiguredBot', deploymentDestination: 'http://test.destinati.on/testBot',
                botType: "InceptionBot").save()

        def inceptionBot = new Bot(name: 'InceptionBot', deploymentDestination: 'http://test.destinati.on/testBot',botType: "InceptionBot").save()
        def fbSpec1 = new FacebookSpec(
                bot: inceptionBot,
                accessToken: 'EAAPuXjjqlQwBALu470kI2gBWKDxDDDZBcEXN9n1xOAnUgcMONTpId6pFjNf1ElbBppySMSRL3zmdsdymkKrZCgE3ZCcBEitxH5XAPf2YOd261bTGGraCYnCQZA9M98ZBiYQIMVBL3C3RTXrZBwRfI1e7NeAfylwVIlUbQesB7m5AZDZD'
        ).save()
        def slackSpec1 = new SlackSpec(
                bot: inceptionBot,
                accessToken: 'slack_token',
                clientId: 'slack_client',
                clientSecret: 'slack_secret',
                userName: 'slack_user'
        ).save()
        def telegramSpec1 = new TelegramSpec(
                bot: inceptionBot,
                accessToken: 'telegram_token',
                webhookUrl: 'telegram_webhook'
        ).save()
    }
    def destroy = {
    }
}
