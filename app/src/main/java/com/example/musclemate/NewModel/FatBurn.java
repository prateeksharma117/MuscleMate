package com.example.musclemate.NewModel;

public class FatBurn {

    private int fatImage;
    private String exercise;


    public int getFatImage() {
        return fatImage;
    }

    public void setFatImage(int fatImage) {
        this.fatImage = fatImage;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public FatBurn(int fatImage, String exercise) {
        this.fatImage = fatImage;
        this.exercise = exercise;
    }


}
