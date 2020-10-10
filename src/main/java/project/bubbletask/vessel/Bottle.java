package main.java.project.bubbletask.vessel;

import main.java.project.bubbletask.material.Material;
import main.java.project.bubbletask.stuff.Bubble;
import main.java.project.bubbletask.stuff.SparklingWater;
import main.java.project.bubbletask.stuff.ITransformable;
import main.java.project.bubbletask.stuff.Water;

public class Bottle {
    private double volume;
    private SparklingWater water = new SparklingWater();

    public Bottle(double volume) {
        double quantity = volume * 10000;
        Bubble[] bubbles = new Bubble[(int) quantity];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("carbon dioxide");
        }
    }

    public void open() {
        this.water.setOpened(true);
    }

    public void warm(int temp) {
        this.water.setTemp(0);
    }

    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        Water newWater = new Water();
    }
}
