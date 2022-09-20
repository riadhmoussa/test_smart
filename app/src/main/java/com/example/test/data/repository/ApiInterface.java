package com.example.test.data.repository;

import com.example.test.data.responses.ResponseTest;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/testdata.json")
    Call<ResponseTest> fetchData();
}
