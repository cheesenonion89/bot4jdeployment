package bot4jdeployment.rest.bot

import bot4jdeployment.rest.bot.model.BotSendPayload
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


/**
 * Created by Markus on 24.04.2017.
 */
interface BotApi {
    @POST("/deploy")
    Call<String> deployBot(@Body BotSendPayload botSendPayload)

}
