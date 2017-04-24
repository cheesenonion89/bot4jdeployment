package bot4jdeployment.rest.bot

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Markus on 24.04.2017.
 */
class BotApiGenerator {

    private final static String BOT_API_URL = "";
    private final static String LOCAL_NETWORK_URL = "http://192.168.0.2:5000/";

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(LOCAL_NETWORK_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    private static OkHttpClient.Builder httpClient =
            new OkHttpClient.Builder();

    static <S> S createService(
            Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }
}
