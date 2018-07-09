package ir.zahrasadeghi.acbase.API;

import android.support.annotation.NonNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChainCallback<T> implements Callback<T> {

    private CustomResponse<T> response;
    private CustomError error;
    private CustomComplete complete;

    public ChainCallback<T> onResponse(CustomResponse<T> onResponse){
        this.response = onResponse;
        return this;
    }

    public ChainCallback<T> onError(CustomError onError){
        this.error = onError;
        return this;
    }

    public ChainCallback<T> onComplete(CustomComplete onComplete){
        this.complete = onComplete;
        return this;
    }

    @Override
    public void onResponse(@NonNull Call<T> call, @NonNull Response<T> response) {
        if(this.response != null)
            this.response.onResponse(response);
        if(this.complete != null)
            this.complete.onComplete();
    }

    @Override
    public void onFailure(@NonNull Call<T> call, @NonNull Throwable t) {
        if(this.error!= null)
            this.error.onError(t);
        if(this.complete != null)
            this.complete.onComplete();
    }


    public interface CustomResponse<T>{
         void onResponse(Response<T> response);
    }

    public interface CustomError {
        void onError(Throwable error);
    }

    public interface CustomComplete{
        void onComplete();
    }
}
