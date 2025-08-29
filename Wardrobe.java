package org.example.model;

public class Wardrobe {
    private int width;
    private int height;
    private double weight;

    public Wardrobe(int height, int width, double weight) {
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
