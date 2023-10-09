import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class RaceCarRunnable extends Car implements Runnable{
    private float passed;
    private final float distance;
    private boolean isFinish;
    private CountDownLatch latch;
    private long finishTime;
    public RaceCarRunnable(String name, int maxSpeed, float distance) {
        super(name, maxSpeed);
        this.distance = distance;
        this.latch = null;
    }
    public RaceCarRunnable(String name, int maxSpeed, float distance, CountDownLatch latch) {
        super(name, maxSpeed);
        this.distance = distance;
        this.latch = latch;
    }
    private int getRandomSpeed() {
        Random random = new Random();
        return random.nextInt((maxSpeed - maxSpeed / 2) + 1) + maxSpeed / 2;
    }
    public long getFinishTime(){
        return finishTime;
    }
    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public void run() {
        while (!isFinish) {
            int currentSpeed = getRandomSpeed();
            passed += currentSpeed;

            if (passed >= distance) {
                passed = distance;
                finishTime = System.currentTimeMillis();
                isFinish = true;
            }

            System.out.println(name + " => speed: " + currentSpeed + "; progress: " + passed + "/" + distance);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        latch.countDown();
        System.out.println(getName() + " FINISHED !");

    }
}
