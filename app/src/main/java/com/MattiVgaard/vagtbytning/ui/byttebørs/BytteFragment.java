package com.MattiVgaard.vagtbytning.ui.byttebørs;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.MattiVgaard.vagtbytning.R;
import com.MattiVgaard.vagtbytning.ui.vagter.Vagt;
import com.MattiVgaard.vagtbytning.ui.vagter.VagtAdapter;
import com.MattiVgaard.vagtbytning.ui.vagter.VagterViewModel;

import java.util.ArrayList;
import java.util.List;

public class BytteFragment extends Fragment {

    private BytteViewModel mViewModel;
    RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_bytte, container, false);
        recyclerView = root.findViewById(R.id.bytterv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.hasFixedSize();

        List<Bytte> vagter = new ArrayList<>();
        vagter.add(new Bytte("Marie","21.11.2022", "16.00", "21.00"));
        vagter.add(new Bytte("Mathias","22.11.2022","14.00","22.00"));
        vagter.add(new Bytte("Viggo","23.11.2022","15.00", "23.00"));

        BytteAdapter adapter = new BytteAdapter(vagter);
        recyclerView.setAdapter(adapter);

        mViewModel = new ViewModelProvider(this).get(BytteViewModel.class);
        return root;
    }

}