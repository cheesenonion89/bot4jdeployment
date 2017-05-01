package bot4jdeployment.rest.bot

import bot4jdeployment.rest.bot.model.BotSendPayload
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by Markus on 24.04.2017.
 */
interface BotApi {

    @GET("/deploy")
    Call<String> getBotTypes(@Path("botId") botId)

    @DELETE("/deploy/{bot_id}")
    Call<String> deleteBot(@Path("bot_id") botId)

    @POST("/deploy")
    Call<String> updateBot(@Body BotSendPayload botSendPayload)

    @PUT("/deploy")
    Call<String> deployBot(@Body BotSendPayload botSendPayload)



}
