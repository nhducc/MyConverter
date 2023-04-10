package com.example.myconverter.Retrofit;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitInterface {
    @GET("v6/2642301c5c8a0afbe03ac7dc/latest/{currency}")
    Call<JsonObject> getExchangeCurrency(@Path("currency") String currency);
}
