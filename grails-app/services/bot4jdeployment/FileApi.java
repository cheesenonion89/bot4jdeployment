package bot4jdeployment;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by Markus on 20.04.2017.
 */
public interface FileApi {

    @POST("training_data")
    Call<String> putTrainingDataDummy(@Body TrainingDataSendPayload trainingDataSendPayload);

    @Multipart
    @POST("training_data/0")
    Call<String> putTrainingData(
            @Part("id") RequestBody id,
            @Part MultipartBody.Part file
            );

    @DELETE("training_data/{id}")
    Call<String> deleteTrainingData(@Path("id") String id);

}
