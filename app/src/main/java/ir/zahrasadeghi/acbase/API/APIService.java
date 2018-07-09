package ir.zahrasadeghi.acbase.API;

import ir.zahrasadeghi.acbase.AppConfig;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sample.API.CallService;

/**
 * Created by Zahra Sadeghi on 4/3/2017.
 */
public class APIService {

    private static CallService instance;
    private static Retrofit retrofit;
    private static OkHttpClient client;

    public APIService() {
    }

    public static synchronized CallService getInstance() {
        if (instance == null) {
            instance = getRetrofit().create(CallService.class);
        }
        return instance;

    }

    private static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(AppConfig.APP_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(getClient())
                    .build();
        }

        return retrofit;
    }

    public static OkHttpClient getClient() {
        if (client == null) {
            OkHttpClient.Builder httpClient = new OkHttpClient().newBuilder();

            httpClient.addInterceptor(chain -> {
                Request request = chain.request().newBuilder()
//                        .addHeader("ClientKey", "1030_1030")
                        .addHeader("Content-Type", "application/json")
                        .build();
                return chain.proceed(request);
            });

            client = httpClient.build();
        }

        return client;
    }
}

