package com.example.musclemate.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musclemate.NewModel.EnrichDiet;
import com.example.musclemate.NewModel.FatBurn;
import com.example.musclemate.R;

import java.util.ArrayList;

public class EnrichDietAdapter extends RecyclerView.Adapter<EnrichDietAdapter.EnrichDietAdapterViewHolder> {

    private ArrayList<EnrichDiet> arrayList;

    public EnrichDietAdapter(ArrayList<EnrichDiet> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public EnrichDietAdapter.EnrichDietAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.enrichdietlayout,parent,false);
        return new EnrichDietAdapterViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull EnrichDietAdapter.EnrichDietAdapterViewHolder holder, int position) {

        holder.enrichImage.setImageResource(arrayList.get(position).getEnrichImage());
        holder.enrichDiet.setText(arrayList.get(position).getEnrichDiet());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class EnrichDietAdapterViewHolder extends RecyclerView.ViewHolder {
        ImageView enrichImage;
        TextView enrichDiet;

        public EnrichDietAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            enrichImage=itemView.findViewById(R.id.enrichImage);
            enrichDiet=itemView.findViewById(R.id.enrichDiet);


        }
    }
}
