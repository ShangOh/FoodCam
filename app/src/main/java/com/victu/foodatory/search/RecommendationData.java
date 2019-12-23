package com.victu.foodatory.search;

public class RecommendationData {
    String name;
    int foodNo;

    public RecommendationData(String name, int foodNo) {
        this.name = name;
        this.foodNo = foodNo;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getFoodNo() {
        return foodNo;
    }

    public void setFoodNo(int foodNo) {
        this.foodNo = foodNo;
    }
}
