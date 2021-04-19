package com.MattiVgaard.vagtbytning.ui.vagter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.MattiVgaard.vagtbytning.R;

import java.util.ArrayList;
import java.util.List;

public class VagterFragment extends Fragment {

    private VagterViewModel vagterViewModel;
    RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_vagter, container, false);
        recyclerView = root.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.hasFixedSize();

        List<Vagt> vagter = new ArrayList<>();
        vagter.add(new Vagt("21.11.2022", "16.00", "21.00"));
        vagter.add(new Vagt("22.11.2022","14.00", "22.00"));
        vagter.add(new Vagt("23.11.2022","15.00", "23.00"));

        VagtAdapter adapter = new VagtAdapter(vagter);
        recyclerView.setAdapter(adapter);

        vagterViewModel = new ViewModelProvider(this).get(VagterViewModel.class);
        return root;
    }
}