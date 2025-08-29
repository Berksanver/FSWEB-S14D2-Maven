package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    public Carpet(int height, int width, PaintColor color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public void lying() {
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public PaintColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}

