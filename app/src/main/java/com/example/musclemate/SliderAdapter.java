package com.example.musclemate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    int images[] = {
            R.drawable.onbord4,
            R.drawable.onbord3,
            R.drawable.onbord2,
            R.drawable.onbord1,
            R.drawable.start,
    };
    int heading[]={
            R.string.onboardHeading1,
            R.string.onboardHeading2,
            R.string.onboardHeading3,
            R.string.onboardHeading4,
            R.string.onboardHeading5,
    };

    int description[]={
            R.string.onboardDescription1,
            R.string.onboardDescription2,
            R.string.onboardDescription3,
            R.string.onboardDescription4,
            R.string.onboardDescription5,
    };

    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==(RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.onboarding1,container,false);

        ImageView imageView=view.findViewById(R.id.onboardImage);
        TextView textView1=view.findViewById(R.id.onboardText1);
        TextView textView2=view.findViewById(R.id.onboarText2);

        imageView.setImageResource(images[position]);
        textView1.setText(heading[position]);
        textView2.setText(description[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
