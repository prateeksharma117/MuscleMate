package com.example.musclemate.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musclemate.NewModel.Stress;
import com.example.musclemate.R;

import java.util.ArrayList;

public class StressAdapter extends RecyclerView.Adapter<StressAdapter.StressAdapterViewHolder> {

    private ArrayList<Stress> arrayList;

    public StressAdapter(ArrayList<Stress> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public StressAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.stresslayout,parent,false);
        return new StressAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StressAdapterViewHolder holder, int position) {
        holder.stressImage.setImageResource(arrayList.get(position).getStressImage());
        holder.stressYoga.setText(arrayList.get(position).getStressYoga());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class StressAdapterViewHolder extends RecyclerView.ViewHolder {
        ImageView stressImage;
        TextView stressYoga;
        public StressAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

           stressImage =itemView.findViewById(R.id.stressImage);
           stressYoga=itemView.findViewById(R.id.stressYoga);

        }
    }
}
