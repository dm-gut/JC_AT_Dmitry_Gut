package main.java.project.bubbletask;

public class Water {
    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private double temp = 0;

    public String getColor() {
        return color;
    }

    public String getTransparency() {
        return transparency;
    }

    public String getSmell() {
        return smell;
    }

    public double getTemp() {
        return temp;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
