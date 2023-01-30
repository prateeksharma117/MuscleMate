package com.example.musclemate.NewModel;

public class YogaPlan {

    private int image;
    private String mainText;
    private String description;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public YogaPlan(int image, String mainText, String description) {
        this.image = image;
        this.mainText = mainText;
        this.description = description;
    }
}
