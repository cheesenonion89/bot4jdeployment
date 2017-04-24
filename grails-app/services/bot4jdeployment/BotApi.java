package bot4jdeployment;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Markus on 24.04.2017.
 */
public interface BotApi {

    @POST
    Call<String> deployBot(@Body Bot bot);
}
