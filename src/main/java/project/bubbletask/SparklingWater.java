package main.java.project.bubbletask;

public class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles = new Bubble[0];

    public void setOpened(boolean opened) {
        isOpened = true;
    }

    SparklingWater() {
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        Bubble[]
    }

    void isOpened() {
        Thread thread = run() -> {
            while (isOpened) {
                System.out.println("Bottle is closed...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                degas();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        thread.start();
    }
}

