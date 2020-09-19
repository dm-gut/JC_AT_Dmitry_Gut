package main.java.project.bubbletask;

public class Bottle {
    private double volume;
    private SparklingWater water = new SparklingWater();

    Bottle(double volume) {
        double quantity = volume * 10000;
        Bubble[] bubbles = new Bubble[(int) quantity];
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
