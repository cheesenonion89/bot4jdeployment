package bot4jdeployment.rest.cnn_server;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.*;

/*
 * HTTP endpoints to communicate with the CNN Server to create / delete a new bot and trigger the transfer learning
 */
public interface CNNServerApi {


    @Multipart
    @PUT("training_data/{id}")
    Call<String> putTrainingData(
            @Path("id") String id,
            @Part MultipartBody.Part file
    );

    @DELETE("training_data/{id}")
    Call<String> deleteTrainingData(@Path("id") String id);

    @PUT("train/{bot_id}")
    Call<String> putTransferLearning(
            @Path("bot_id") String bot_id
    );

}
