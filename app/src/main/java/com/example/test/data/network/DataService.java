package com.example.test.data.network;

import com.example.test.data.repository.ApiInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataService {

    private static final String URL = "";

    private final ApiInterface dataApi;

    private static DataService singleton;

    private DataService() {
        Retrofit mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(URL).build();

        dataApi = mRetrofit.create(ApiInterface.class);
    }

    public static DataService getInstance() {
        if (singleton == null) {
            synchronized (DataService.class) {
                if (singleton == null) {
                    singleton = new DataService();
                }
            }
        }
        return singleton;
    }

    public ApiInterface getMovieApi() {
        return dataApi;
    }

}