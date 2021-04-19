package com.MattiVgaard.vagtbytning.ui.vagter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.MattiVgaard.vagtbytning.R;

import java.util.List;

public class VagtAdapter extends RecyclerView.Adapter<VagtAdapter.ViewHolder> {

    List<Vagt> vagter;
    OnListItemClickListener listener;

    public VagtAdapter(List<Vagt> vagter, OnListItemClickListener listener){
        this.vagter = vagter;
        this.listener = listener;
    }

    public VagtAdapter(List<Vagt> vagter) {
        this.vagter = vagter;
    }

    @NonNull
    @Override
    public VagtAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.vagt_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.dato.setText(vagter.get(position).getDato());
        holder.startTime.setText(vagter.get(position).getTimeStart());
        holder.slutTime.setText(vagter.get(position).getTimeSlut());
    }

    @Override
    public int getItemCount() {
        return vagter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView dato;
        TextView startTime;
        TextView slutTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(getAdapterPosition());
                }
            });
            dato = itemView.findViewById(R.id.vagtDato);
            startTime = itemView.findViewById(R.id.vagtTidFra);
            slutTime = itemView.findViewById(R.id.vagtTidTil);
        }
    }

    public interface OnListItemClickListener{
        void onClick(int position);
    }
}
