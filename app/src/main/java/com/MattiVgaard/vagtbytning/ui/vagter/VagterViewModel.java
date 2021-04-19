package com.MattiVgaard.vagtbytning.ui.vagter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

public class VagterViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VagterViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is indboks fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}