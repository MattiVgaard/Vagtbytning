package com.MattiVgaard.vagtbytning.ui.indboks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.MattiVgaard.vagtbytning.R;

public class IndboksFragment extends Fragment {

    private IndboksViewModel indboksViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        indboksViewModel =
                new ViewModelProvider(this).get(IndboksViewModel.class);
        View root = inflater.inflate(R.layout.fragment_indboks, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        indboksViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}