package com.example.musclemate.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musclemate.NewModel.FatBurn;
import com.example.musclemate.R;

import java.util.ArrayList;

public class FatBurnAdapter extends RecyclerView.Adapter<FatBurnAdapter.FatBurnAdapterViewHolder> {

    private ArrayList<FatBurn> arrayList;

    public FatBurnAdapter(ArrayList<FatBurn> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public FatBurnAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fatburn,parent,false);
        return new FatBurnAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FatBurnAdapterViewHolder holder, int position) {

        holder.fatBurnImage.setImageResource(arrayList.get(position).getFatImage());
        holder.exercise.setText(arrayList.get(position).getExercise());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class FatBurnAdapterViewHolder extends RecyclerView.ViewHolder {
        ImageView fatBurnImage;
        TextView exercise;
        public FatBurnAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            fatBurnImage=itemView.findViewById(R.id.fatBurn);
            exercise=itemView.findViewById(R.id.exercise);


        }
    }
}


