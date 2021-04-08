package com.MattiVgaard.vagtbytning.ui.telefonbog;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.MattiVgaard.vagtbytning.R;

public class TelefonbogFragment extends Fragment {

    private TelefonbogViewModel mViewModel;

    public static TelefonbogFragment newInstance() {
        return new TelefonbogFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_telefonbog, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(TelefonbogViewModel.class);
        // TODO: Use the ViewModel
    }

}