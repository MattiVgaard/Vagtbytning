package com.MattiVgaard.vagtbytning.ui.indboks;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IndboksViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IndboksViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is indboks fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}