package com.example.musclemate;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.musclemate.databinding.ActivityOnboardingBinding;

public class Onboarding extends AppCompatActivity {
    ActivityOnboardingBinding binding;
    SliderAdapter sliderAdapter;
    TextView[] dots;
    Animation animation;
    int currentPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOnboardingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        onDots(0);
        binding.onBordViewpager.addOnPageChangeListener(onPageChangeListener);
        sliderAdapter=new SliderAdapter(this);
        binding.onBordViewpager.setAdapter(sliderAdapter);

        binding.nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });

        binding.previousBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previous();
            }
        });

        binding.letGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Onboarding.this,MainActivity.class));
            }
        });

//last bracket
    }


    private void next()
    {
        binding.onBordViewpager.setCurrentItem(currentPosition+1);
    }
    private void previous()
    {
        binding.onBordViewpager.setCurrentItem(currentPosition-1);
    }


    private void onDots(int position)
    {
        dots=new TextView[5];
        binding.dotsLayout.removeAllViews();
        for (int i=0;i<dots.length;i++)
        {
            dots[i]=new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(25);
            binding.dotsLayout.addView(dots[i]);
        }
        if (dots.length>0)
        {
            dots[position].setTextColor(getResources().getColor(R.color.green));
        }
    }

    ViewPager.OnPageChangeListener onPageChangeListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            onDots(position);
            currentPosition=position;
            if (position==0)
            {
                binding.letGetStarted.setVisibility(View.GONE);
            }
            else if (position==1)
            {
                binding.letGetStarted.setVisibility(View.GONE);
            }
            else if (position==2)
            {
                binding.letGetStarted.setVisibility(View.GONE);
            }
            else if (position==3)
            {
                binding.letGetStarted.setVisibility(View.GONE);
            }
            else
            {
                animation= AnimationUtils.loadAnimation(Onboarding.this,R.anim.onboardbtn);
                binding.letGetStarted.setAnimation(animation);
                binding.letGetStarted.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}