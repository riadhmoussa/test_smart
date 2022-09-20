package com.example.test.ui.activitys;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.test.data.repository.MainRepository;
import com.example.test.viewmodels.MainViewModel;

public class MainViewModelFactory implements ViewModelProvider.Factory {

    private final MainRepository Datarepository;

    public MainViewModelFactory(MainRepository repository) {
        this.Datarepository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            return (T) new MainViewModel(Datarepository);
        }

        throw new IllegalArgumentException("Unknown ViewModel class");
    }

}
