package com.MattiVgaard.vagtbytning.ui.highscore;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.MattiVgaard.vagtbytning.R;

public class HighscoreFragment extends Fragment {

    private HighscoreViewModel mViewModel;

    public static HighscoreFragment newInstance() {
        return new HighscoreFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_highscore, container, false);

        int timer = 25;
        int timeløn = 130;
        String samletløn = "" + timer*timeløn;

        TextView løn = root.findViewById(R.id.highscorebeløb);
        TextView score1 = root.findViewById(R.id.highscore1);
        TextView score2 = root.findViewById(R.id.highscore2);
        TextView score3 = root.findViewById(R.id.highscore3);
        TextView score4 = root.findViewById(R.id.highscore4);
        TextView score5 = root.findViewById(R.id.highscore5);
        løn.setText(samletløn + " Kr");
        score1.setText("Signe");
        score2.setText("Frederik");
        score3.setText("Mathias");
        score4.setText("Viggo");
        score5.setText("Lars");


        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HighscoreViewModel.class);
        // TODO: Use the ViewModel
    }

}