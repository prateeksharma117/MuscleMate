package com.example.musclemate.NewModel;

public class Categorydiet {

    private int categoryImage;
    private String categoryDiet;

    public int getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(int categoryImage) {
        this.categoryImage = categoryImage;
    }

    public String getCategoryDiet() {
        return categoryDiet;
    }

    public void setCategoryDiet(String categoryDiet) {
        this.categoryDiet = categoryDiet;
    }

    public Categorydiet(int categoryImage, String categoryDiet) {
        this.categoryImage = categoryImage;
        this.categoryDiet = categoryDiet;
    }


}
