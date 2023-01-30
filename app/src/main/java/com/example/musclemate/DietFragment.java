package com.example.musclemate;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.musclemate.Adapter.CategoryDietAdapter;
import com.example.musclemate.Adapter.EnrichDietAdapter;
import com.example.musclemate.NewModel.Categorydiet;
import com.example.musclemate.NewModel.EnrichDiet;
import com.example.musclemate.databinding.FragmentDietBinding;

import java.util.ArrayList;


public class DietFragment extends Fragment {



    public DietFragment() {
        // Required empty public constructor
    }
    FragmentDietBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentDietBinding.inflate(inflater, container, false);

        binding.enrichRecyclerView.setHasFixedSize(true);
        binding.enrichRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<EnrichDiet> enrichDietArrayList=new ArrayList<>();
        enrichDietArrayList.add(new EnrichDiet(R.drawable.protein,"Protein rich diet"));
        enrichDietArrayList.add(new EnrichDiet(R.drawable.carbohydrates,"Carbohydrate rich diet"));
        enrichDietArrayList.add(new EnrichDiet(R.drawable.fats,"Fat rich diet"));
        enrichDietArrayList.add(new EnrichDiet(R.drawable.nutrition,"Nutrition rich diet"));

        EnrichDietAdapter enrichDietAdapter=new EnrichDietAdapter(enrichDietArrayList);
        binding.enrichRecyclerView.setAdapter(enrichDietAdapter);

        binding.categoryRecyclerView.setHasFixedSize(true);
        binding.categoryRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<Categorydiet> categorydietArrayList=new ArrayList<>();
        categorydietArrayList.add(new Categorydiet(R.drawable.vegediet,"Vegan diet"));
        categorydietArrayList.add(new Categorydiet(R.drawable.nonvegediet,"Non Vegan diet"));
        categorydietArrayList.add(new Categorydiet(R.drawable.liquiddiet,"Liquid diet"));
        categorydietArrayList.add(new Categorydiet(R.drawable.soliddiet,"Solid diet"));

        CategoryDietAdapter categoryDietAdapter =new CategoryDietAdapter(categorydietArrayList);
        binding.categoryRecyclerView.setAdapter(categoryDietAdapter);





        return binding.getRoot();
    }
}