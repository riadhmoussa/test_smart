package com.example.test.data.repository;


public class RemoteDataSource implements DataSource.Remote {

    private static RemoteDataSource instance;

    private final ApiInterface dataApi;

    private RemoteDataSource(ApiInterface dataApi) {
        this.dataApi = dataApi;
    }

    public static RemoteDataSource getInstance(ApiInterface movieApi) {
        if (instance == null) {
            instance = new RemoteDataSource(movieApi);
        }
        return instance;
    }


}
