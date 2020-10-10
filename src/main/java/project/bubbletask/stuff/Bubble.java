package main.java.project.bubbletask.stuff;

public class Bubble {
    private double VOLUME = 0.3;
    private String gas;

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void cramp() {
        System.out.println("Cramping bubbles");
        System.out.println("Cramp!");
    }

    public double getVolume() {
        return VOLUME;
    }
}
