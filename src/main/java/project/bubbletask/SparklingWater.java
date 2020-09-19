package main.java.project.bubbletask;

public class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles;

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean opened) {
        isOpened = true;
    }

    SparklingWater() {
        isOpened();
    }

    private void isOpened() {
        isOpened = true;
    }

    public void pump(Bubble[] bubbles) {
        setBubbles(bubbles);
    }

    void checkIsOpened() {
/*

        Thread thread = run() → {
            while (!isOpened) {
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

*/
    }
    private void degas() {

    }

    public boolean isSparkle() {
        if (bubbles.length > 0) {
        }
        return true;
    }
}

