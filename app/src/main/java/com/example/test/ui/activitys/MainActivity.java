package com.example.test.ui.activitys;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.example.test.data.DataManager;
import com.example.test.data.repository.MainRepository;
import com.example.test.databinding.ActivityMainBinding;
import com.example.test.ui.bases.BaseActivity;
import com.example.test.viewmodels.MainViewModel;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {


    @NonNull
    @Override
    protected MainViewModel createViewModel() {
        MainRepository dataRepository = DataManager.getInstance().getDataRepository();
        MainViewModelFactory factory = new MainViewModelFactory(dataRepository);
        return new ViewModelProvider(this,factory).get(MainViewModel.class);
    }

    @NonNull
    @Override
    protected ActivityMainBinding createViewBinding(LayoutInflater layoutInflater) {
        return ActivityMainBinding.inflate(layoutInflater);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}