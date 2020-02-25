package com.company;

public class Pillow implements Comparable<Pillow> {
    private int price;
    private int softness;
    private double weight;

    public Pillow(int price, int softness, double weight) {
        this.price = price;
        this.softness = softness;
        this.weight = weight;
    }

    public String toString() {
        return  "p: " + this.price
                + " s:" + this.softness
                +  " w: " + this.weight;
    }

    public int getPrice() {
        return price;
    }

    public int getSoftness() {
        return softness;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Pillow pillow) {
        return this.weight > pillow.getWeight() ? 1 : 0;
    }
}
