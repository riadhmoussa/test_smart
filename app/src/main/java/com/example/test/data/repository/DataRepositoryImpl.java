package com.example.test.data.repository;

public class DataRepositoryImpl implements MainRepository {

    private final DataSource.Remote movieRemote;


    private static DataRepositoryImpl instance;

    private DataRepositoryImpl(RemoteDataSource movieRemote) {
        this.movieRemote = movieRemote;

    }

    public static DataRepositoryImpl getInstance(RemoteDataSource movieRemote) {
        if (instance == null) {
            instance = new DataRepositoryImpl(movieRemote);
        }
        return instance;
    }

}
