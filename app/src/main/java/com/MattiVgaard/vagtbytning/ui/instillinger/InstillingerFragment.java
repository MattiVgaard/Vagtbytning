package com.MattiVgaard.vagtbytning.ui.instillinger;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.MattiVgaard.vagtbytning.R;

public class InstillingerFragment extends Fragment {

    private InstillingerViewModel mViewModel;

    public static InstillingerFragment newInstance() {
        return new InstillingerFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_instillinger, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(InstillingerViewModel.class);
        // TODO: Use the ViewModel
    }

}