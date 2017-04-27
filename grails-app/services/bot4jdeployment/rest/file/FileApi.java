package bot4jdeployment.rest.file;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by Markus on 20.04.2017.
 */
public interface FileApi {


    @Multipart
    @PUT("training_data/{id}")
    Call<String> putTrainingData(
            @Path("id") String id,
            @Part MultipartBody.Part file
    );

    @DELETE("training_data/{id}")
    Call<String> deleteTrainingData(@Path("id") String id);

}
