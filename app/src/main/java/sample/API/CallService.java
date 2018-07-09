package sample.API;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import sample.Model.User;

/**
 * Created by Zahra Sadeghi on 4/1/2017.
 *
 * add rest calls here
 *
 */
public interface CallService {
        
        @GET("/user")
        Call<User> listChannels();

        @GET("/api/channel/{channelId}/messages")
        Call<ResponseBody> listChannelActivity(@Query("channelId") String channelId);

        //TODO need authentication
        @GET("/api/channel/{channelId}/button")
        Call<ResponseBody> listChannelButton(@Query("channelId") String channelId);

        @POST("/api/user/login/phone")
        @FormUrlEncoded
        Call<ResponseBody> logIn(@Field("MobileEmail") String username);

}
