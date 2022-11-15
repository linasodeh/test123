package com.example.myapplication;

public class DistanceSensor {
    private int maxDistance;
    private String type;
    private int minDistance;
    private int accuracy;


    public DistanceSensor(String type, int maxDistance, int minDistance,int accuracy) {
        this.type = type;
        this.maxDistance = maxDistance;
        this.minDistance = minDistance;
        this.accuracy = accuracy;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public String getType() {
        return type;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "DistanceSensor{" +
                "maxDistance=" + maxDistance +
                ", type='" + type + '\'' +
                ", minDistance=" + minDistance +
                ", accuracy=" + accuracy +
                '}';
    }
}
