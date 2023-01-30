package com.example.musclemate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.musclemate.Adapter.FatBurnAdapter;
import com.example.musclemate.Adapter.StressAdapter;
import com.example.musclemate.Adapter.YogaPlans;
import com.example.musclemate.NewModel.FatBurn;
import com.example.musclemate.NewModel.Stress;
import com.example.musclemate.NewModel.YogaPlan;
import com.example.musclemate.databinding.FragmentYogaBinding;

import java.util.ArrayList;

public class YogaFragment extends Fragment {


    public YogaFragment() {
        // Required empty public constructor
    }
    FragmentYogaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentYogaBinding.inflate(inflater, container, false);

        binding.planRecyclerView.setHasFixedSize(true);
        binding.planRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<YogaPlan> arrayList=new ArrayList<>();
        arrayList.add(new YogaPlan(R.drawable.beginneryoga,"Beginner Plan","Start with a few minutes of deep breathing exercises."));
        arrayList.add(new YogaPlan(R.drawable.intermediateyoga,"Intermediate Paln","Move on to a series of simple stretches, such as neck rolls, shoulder rolls."));
        arrayList.add(new YogaPlan(R.drawable.advancedyoga,"Advanced Plan","Finish with a few minutes of savasana to relax and release tension from the body."));

        YogaPlans yogaPlans=new YogaPlans(arrayList);
        binding.planRecyclerView.setAdapter(yogaPlans);

        binding.fatBurnRecyclerView.setHasFixedSize(true);
        binding.fatBurnRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FatBurn> fatBurnArrayList=new ArrayList<>();
        fatBurnArrayList.add(new FatBurn(R.drawable.fatburner,"Fat burner"));
        fatBurnArrayList.add(new FatBurn(R.drawable.chestfatburn,"Killer chest Yoga"));
        fatBurnArrayList.add(new FatBurn(R.drawable.bellyfatburn,"Belly fat burner"));
        fatBurnArrayList.add(new FatBurn(R.drawable.dailytwentyminuts,"20 Minutes Yoga"));
        fatBurnArrayList.add(new FatBurn(R.drawable.killerlegs,"Killer legs Fat Burner"));

        FatBurnAdapter fatBurn=new FatBurnAdapter(fatBurnArrayList);
        binding.fatBurnRecyclerView.setAdapter(fatBurn);

        binding.stressRecyclerView.setHasFixedSize(true);
        binding.stressRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<Stress> stressArrayList=new ArrayList<>();
        stressArrayList.add(new Stress(R.drawable.destress,"De-stressing Yoga"));
        stressArrayList.add(new Stress(R.drawable.posture,"Posture Yoga"));
        stressArrayList.add(new Stress(R.drawable.stressyoga,"Long sitting stress Yoga"));
        stressArrayList.add(new Stress(R.drawable.nackyoga,"Neck Yoga"));

        StressAdapter stressAdapter=new StressAdapter(stressArrayList);
        binding.stressRecyclerView.setAdapter(stressAdapter);


        return binding.getRoot();
    }
}