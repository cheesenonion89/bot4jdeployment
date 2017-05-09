package bot4jdeployment

import bot4jdeployment.rest.cnn_server.CNNServerApi
import bot4jdeployment.rest.cnn_server.CNNServerApiGenerator
import grails.transaction.Transactional
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Markus on 09.05.2017.
 */
@Transactional
class TransferLearningService {

    private final CNNServerApi cnnServerApi = CNNServerApiGenerator.createService(CNNServerApi.class)

    def startTransferLearning(Bot bot) {
        Call<String> call = cnnServerApi.putTransferLearning(bot.id.toString())
        // TODO: Make sure a response is retrieved after transfer learning. At the same time restrict Transfer Learning Time on CNN Server
        call.enqueue(new Callback<String>() {
            @Override
            void onResponse(Call<String> cl, Response<String> rspns) {
                if (rspns.isSuccessful()) {
                    println(rspns.body())
                } else {
                    println("Transfer Learning Request Failed")
                }
            }

            @Override
            void onFailure(Call<String> cl, Throwable t) {
                println("On Failure")
                print(t.getMessage())
            }
        })
        return bot
    }

}
