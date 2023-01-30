package com.example.musclemate.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musclemate.NewModel.YogaPlan;
import com.example.musclemate.R;

import java.util.ArrayList;

public class YogaPlans extends RecyclerView.Adapter<YogaPlans.YogaPlansViewHolder> {

    Context context;
    private ArrayList<YogaPlan> arrayList;

    public YogaPlans(ArrayList<YogaPlan> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public YogaPlansViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.yogarecyclerviewlayout,parent,false);
        return new YogaPlansViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YogaPlansViewHolder holder, int position) {
        holder.image.setImageResource(arrayList.get(position).getImage());
        holder.heading.setText(arrayList.get(position).getMainText());
        holder.description.setText(arrayList.get(position).getDescription());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class YogaPlansViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView heading;
        TextView description;
        public YogaPlansViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.yogaPlanImage);
            heading=itemView.findViewById(R.id.mainText);
            description=itemView.findViewById(R.id.description);
        }
    }
}
