package com.MattiVgaard.vagtbytning.ui.sygmelding;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.MattiVgaard.vagtbytning.R;

public class SygmeldingFragment extends Fragment {

    private SygmeldingViewModel mViewModel;

    public static SygmeldingFragment newInstance() {
        return new SygmeldingFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this).get(SygmeldingViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sygmelding, container, false);
        Button button1 = root.findViewById(R.id.ferieButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Ønsket ferie sendt!", Toast.LENGTH_LONG).show();
            }
        });

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SygmeldingViewModel.class);
        // TODO: Use the ViewModel
    }

}