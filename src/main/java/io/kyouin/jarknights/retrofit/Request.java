package io.kyouin.jarknights.retrofit;

import io.kyouin.jarknights.utils.AKConstants;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Request {

    private final static OkHttpClient HTTP_CLIENT = new OkHttpClient.Builder()
            .connectTimeout(AKConstants.HTTP_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(AKConstants.HTTP_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(AKConstants.HTTP_TIMEOUT, TimeUnit.SECONDS)
            .build();

    private final static Retrofit RETROFIT = new Retrofit.Builder()
            .client(HTTP_CLIENT)
            .baseUrl(AKConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public final static Requests METHODS = RETROFIT.create(Requests.class);

    public static <T> T get(Call<T> call) {
        try {
            Response<T> response = call.execute();

            if (response.isSuccessful()) {
                T apiResponse = response.body();

                if (apiResponse != null) return apiResponse;
            } else if (response.errorBody() != null) System.out.println("Error: " + response.errorBody().string() + "; URL: " + call.request().url().url().getPath());
        } catch (IOException e) {
            //TODO logger
            e.printStackTrace();
        }

        return null;
    }
}
