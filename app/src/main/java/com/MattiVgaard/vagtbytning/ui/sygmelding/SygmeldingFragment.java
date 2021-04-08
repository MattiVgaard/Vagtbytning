package com.MattiVgaard.vagtbytning.ui.sygmelding;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.MattiVgaard.vagtbytning.R;

public class SygmeldingFragment extends Fragment {

    private SygmeldingViewModel mViewModel;

    public static SygmeldingFragment newInstance() {
        return new SygmeldingFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sygmelding, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SygmeldingViewModel.class);
        // TODO: Use the ViewModel
    }

}