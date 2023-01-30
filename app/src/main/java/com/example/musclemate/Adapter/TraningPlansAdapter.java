package com.example.musclemate.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musclemate.NewModel.TrainingPlans;
import com.example.musclemate.R;

import java.util.ArrayList;

public class TraningPlansAdapter extends RecyclerView.Adapter<TraningPlansAdapter.TraningPlansAdapterViewHolder> {

    Context context;
    private ArrayList<TrainingPlans> arrayList;

    public TraningPlansAdapter(ArrayList<TrainingPlans> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public TraningPlansAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.trainingrecyclerviewlayout,parent,false);
        return new TraningPlansAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TraningPlansAdapterViewHolder holder, int position) {
        holder.image.setImageResource(arrayList.get(position).getImage());
        holder.heading.setText(arrayList.get(position).getMainText());
        holder.description.setText(arrayList.get(position).getDescription());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class TraningPlansAdapterViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView heading;
        TextView description;
        public TraningPlansAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.PlanImage);
            heading=itemView.findViewById(R.id.mainText);
            description=itemView.findViewById(R.id.description);



        }
    }
}
