package main.java.project.bubbletask.stuff;

public class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles;

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean opened) {
        isOpened = true;
    }

    public SparklingWater() {
        checkIsOpened();
    }

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
        checkIsOpened();
    }

    private void isOpened() {
        isOpened = true;
    }

    public void pump(Bubble[] bubbles) {
        setBubbles(bubbles);
    }

    void checkIsOpened() {

        Thread thread = new Thread() {
            public void run() {
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
            }
        };
        thread.start();
    }

    private void degas() throws InterruptedException {
       /* long l1 = System.currentTimeMillis();
        try {
            double crampBubbles = 0;
            for (int i = 0; i < this.bubbles.size() && this.bubbles.size() >= crampBubbles; i++) {
                crampBubbles = 10 + 5 * Math.floor(this.getTemperature());
                for (int j = 0; j <= crampBubbles; j++) {
                    bubbles.remove(j);
                }
                if (this.bubbles.size() < crampBubbles) {
                    for (int k = 0; k < this.bubbles.size(); k++) {
                        bubbles.remove(k);
                    }
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long l2 = System.currentTimeMillis() - l1;
        System.out.println("The water became still in" + " " + l2 / 1000 + " " + "seconds");*/
    }

    public boolean isSparkle() {
        if (bubbles.length > 0) {
            return true;
        } else {
            return false;
        }
    }
}

