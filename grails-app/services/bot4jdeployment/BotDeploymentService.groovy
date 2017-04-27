package bot4jdeployment

import bot4jdeployment.rest.bot.BotApi
import bot4jdeployment.rest.bot.BotApiGenerator
import bot4jdeployment.rest.bot.model.BotSendPayload
import bot4jdeployment.rest.bot.model.FacebookSpecPayload
import bot4jdeployment.rest.bot.model.SlackSpecPayload
import bot4jdeployment.rest.bot.model.TelegramSpecPayload
import grails.transaction.Transactional
import retrofit2.Call
import retrofit2.Response
import groovy.json.JsonBuilder



@Transactional
class BotDeploymentService {

    private final botApi = BotApiGenerator.createService(BotApi.class)

    def deployBot(Bot bot) {

        Call<String> call = botApi.deployBot(domainToRestModel(bot))
        Response<String> response = call.execute()
        println(response.body())
    }

    def domainToRestModel(Bot bot){
        FacebookSpecPayload facebookSpecPayload = new FacebookSpecPayload(
                bot.facebookSpec.accessToken
        )
        SlackSpecPayload slackSpecPayload = new SlackSpecPayload(
                bot.slackSpec.accessToken,
                bot.slackSpec.clientId,
                bot.slackSpec.clientSecret,
                bot.slackSpec.userName
        )
        TelegramSpecPayload telegramSpecPayload = new TelegramSpecPayload(
                bot.telegramSpec.accessToken,
                bot.telegramSpec.webhookUrl
        )
        BotSendPayload botSendPayload = new BotSendPayload(
                bot.id,
                bot.name,
                bot.deploymentDestination,
                bot.botType,
                facebookSpecPayload,
                slackSpecPayload,
                telegramSpecPayload
        )
        return botSendPayload
    }

}
