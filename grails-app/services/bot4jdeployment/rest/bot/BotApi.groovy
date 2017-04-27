package bot4jdeployment.rest.bot

import bot4jdeployment.rest.bot.model.BotSendPayload
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT


/**
 * Created by Markus on 24.04.2017.
 */
interface BotApi {
    @PUT("/deploy")
    Call<String> deployBot(@Body BotSendPayload botSendPayload)

}
