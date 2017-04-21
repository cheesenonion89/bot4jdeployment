package bot4jdeployment;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Markus on 20.04.2017.
 */
public interface FileApi {

    @POST("training_data")
    Call<String> putTrainingDataDummy(@Body TrainingDataSendPayload trainingDataSendPayload);

    @Multipart
    @POST("training_data")
    Call<String> putTrainingData(
            @Part("id") RequestBody id,
            @Part MultipartBody.Part file
            );

    @Multipart
    @POST("training_data")
    Call<String> putTrainingDataSimple(
            @Part MultipartBody.Part file
    );

}
