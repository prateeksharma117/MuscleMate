package com.example.musclemate.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musclemate.NewModel.Categorydiet;
import com.example.musclemate.NewModel.EnrichDiet;
import com.example.musclemate.R;

import java.util.ArrayList;

public class CategoryDietAdapter extends RecyclerView.Adapter<CategoryDietAdapter.CategoryDietAdapterViewHolder> {

    private ArrayList<Categorydiet> arrayList;

    public CategoryDietAdapter(ArrayList<Categorydiet> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public CategoryDietAdapter.CategoryDietAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.categorydietlayout,parent,false);
        return new CategoryDietAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryDietAdapter.CategoryDietAdapterViewHolder holder, int position) {
        holder.categoryImage.setImageResource(arrayList.get(position).getCategoryImage());
        holder.categoryDiet.setText(arrayList.get(position).getCategoryDiet());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class CategoryDietAdapterViewHolder extends RecyclerView.ViewHolder {
        ImageView categoryImage;
        TextView categoryDiet;

        public CategoryDietAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryImage=itemView.findViewById(R.id.categoryImage);
            categoryDiet=itemView.findViewById(R.id.categoryDiet);

        }
    }
}
