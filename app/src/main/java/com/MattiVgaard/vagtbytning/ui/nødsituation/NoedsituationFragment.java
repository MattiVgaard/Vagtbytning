package com.MattiVgaard.vagtbytning.ui.nødsituation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.MattiVgaard.vagtbytning.MainActivity;
import com.MattiVgaard.vagtbytning.R;

public class NoedsituationFragment extends Fragment {

    private NoedsituationViewModel noedsituationViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        noedsituationViewModel =
                new ViewModelProvider(this).get(NoedsituationViewModel.class);
        View root = inflater.inflate(R.layout.fragment_noedsituation, container, false);
       final TextView textView = root.findViewById(R.id.nødHeadline);
        final TextView maintext = root.findViewById(R.id.nødText);

        maintext.setText("Hej vi har en som har meldt sig syg idag. Har du mulighed for at tage en vagt fra kl 15-21 idag?");
        Button button1 = root.findViewById(R.id.nødknap1);
        Button button4 = root.findViewById(R.id.nødsvarknap);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Tak fordi du kunne tage vagten!", Toast.LENGTH_LONG).show();
            }
        });
        EditText editText = root.findViewById(R.id.editTextnødsvar);
        TextView textview2 = root.findViewById(R.id.nødsvartext);
        Button button2 = root.findViewById(R.id.nødknap2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setVisibility(View.VISIBLE);
                textview2.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
            }
        });

        Button button3 = root.findViewById(R.id.nødknap3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Tak fordi du svarede", Toast.LENGTH_LONG).show();
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Tak fordi du svarede", Toast.LENGTH_LONG).show();
            }
        });

        noedsituationViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
          @Override
         public void onChanged(@Nullable String s) {
            textView.setText(s);
        }

     });
        return root;
    }


}