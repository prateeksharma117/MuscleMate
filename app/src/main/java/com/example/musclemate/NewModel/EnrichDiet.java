package com.example.musclemate.NewModel;

public class EnrichDiet {
    private int enrichImage;
    private String enrichDiet;

    public int getEnrichImage() {
        return enrichImage;
    }

    public void setEnrichImage(int enrichImage) {
        this.enrichImage = enrichImage;
    }

    public String getEnrichDiet() {
        return enrichDiet;
    }

    public void setEnrichDiet(String enrichDiet) {
        this.enrichDiet = enrichDiet;
    }

    public EnrichDiet(int enrichImage, String enrichDiet) {
        this.enrichImage = enrichImage;
        this.enrichDiet = enrichDiet;
    }
}
