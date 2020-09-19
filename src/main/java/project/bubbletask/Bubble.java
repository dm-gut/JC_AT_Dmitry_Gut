package main.java.project.bubbletask;

public class Bubble {
    private double VOLUME = 0.3;
    String gas;

    Bubble(String gas) {
        this.gas = "carbon";
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

    public double getVolume() {
        return VOLUME;
    }
}
