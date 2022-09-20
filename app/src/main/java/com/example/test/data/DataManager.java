package com.example.test.data;

import android.preference.Preference;

import com.example.test.data.network.DataService;
import com.example.test.data.repository.ApiInterface;
import com.example.test.data.repository.DataRepositoryImpl;
import com.example.test.data.repository.MainRepository;
import com.example.test.data.repository.RemoteDataSource;

public class DataManager {

    private static DataManager sInstance;

    private DataManager() {
        // This class is not publicly instantiable
    }

    public static synchronized DataManager getInstance() {
        if (sInstance == null) {
            sInstance = new DataManager();
        }
        return sInstance;
    }


    public MainRepository getDataRepository() {

        ApiInterface dataApi = DataService.getInstance().getMovieApi();
        RemoteDataSource movieRemote = RemoteDataSource.getInstance(dataApi);

        return DataRepositoryImpl.getInstance(movieRemote);
    }

}
