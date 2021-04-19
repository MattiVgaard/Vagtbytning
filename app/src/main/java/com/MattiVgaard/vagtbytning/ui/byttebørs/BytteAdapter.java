package com.MattiVgaard.vagtbytning.ui.byttebørs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.MattiVgaard.vagtbytning.R;
import com.MattiVgaard.vagtbytning.ui.vagter.Vagt;
import com.MattiVgaard.vagtbytning.ui.vagter.VagtAdapter;

import org.w3c.dom.Text;

import java.util.List;

public class BytteAdapter extends RecyclerView.Adapter<BytteAdapter.ViewHolder> {

    List<Bytte> vagter;
    OnListItemClickListener listener;

    public BytteAdapter(List<Bytte> vagter, BytteAdapter.OnListItemClickListener listener){
        this.vagter = vagter;
        this.listener = listener;
    }
    public BytteAdapter(List<Bytte> vagter) {
        this.vagter = vagter;
    }

    @NonNull
    @Override
    public BytteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.bytte_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BytteAdapter.ViewHolder holder, int position) {
        holder.dato.setText(vagter.get(position).getDato());
        holder.startTime.setText(vagter.get(position).getTimeStart());
        holder.slutTime.setText(vagter.get(position).getTimeSlut());
        holder.name.setText(vagter.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return vagter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
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
            name = itemView.findViewById(R.id.byttenavn);
            dato = itemView.findViewById(R.id.bytteDato);
            startTime = itemView.findViewById(R.id.bytteTidFra);
            slutTime = itemView.findViewById(R.id.bytteTidTil);
        }
    }

    public interface OnListItemClickListener{
        void onClick(int position);
    }
}
