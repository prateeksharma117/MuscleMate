package com.example.musclemate.NewModel;

public class Stress {

    private int stressImage;
    private String stressYoga;

    public int getStressImage() {
        return stressImage;
    }

    public void setStressImage(int stressImage) {
        this.stressImage = stressImage;
    }

    public String getStressYoga() {
        return stressYoga;
    }

    public void setStressYoga(String stressYoga) {
        this.stressYoga = stressYoga;
    }

    public Stress(int stressImage, String stressYoga) {
        this.stressImage = stressImage;
        this.stressYoga = stressYoga;
    }


}
