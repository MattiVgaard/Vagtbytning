package com.MattiVgaard.vagtbytning.ui.nødsituation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NoedsituationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NoedsituationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Dato:");
    }

    public LiveData<String> getText() {
        return mText;
    }
}