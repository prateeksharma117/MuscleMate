package com.example.musclemate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.musclemate.Adapter.TraningPlansAdapter;
import com.example.musclemate.NewModel.TrainingPlans;
import com.example.musclemate.databinding.FragmentTranningBinding;

import java.util.ArrayList;


public class TranningFragment extends Fragment {


    public TranningFragment() {
        // Required empty public constructor
    }
    FragmentTranningBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentTranningBinding.inflate(inflater, container, false);


        binding.planRecyclerView.setHasFixedSize(true);
        binding.planRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<TrainingPlans> arrayList=new ArrayList<>();
        arrayList.add(new TrainingPlans(R.drawable.traningbeginner,"Beginner Plan","Start by setting a goal to continue with the workout programme for three months."));
        arrayList.add(new TrainingPlans(R.drawable.traningintermediate,"Intermediate Paln","The Next Step: 6 Week Intermediate Mass Building Workout."));
        arrayList.add(new TrainingPlans(R.drawable.trainingadvaced,"Advanced Plan","When you wake up in the morning, your workout begins, not when you walk into the gym."));

        TraningPlansAdapter traningPlansAdapter=new TraningPlansAdapter(arrayList);
        binding.planRecyclerView.setAdapter(traningPlansAdapter);

        return binding.getRoot();
    }
}