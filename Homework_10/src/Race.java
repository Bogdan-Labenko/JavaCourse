import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Date;

public class Race {
    public static AtomicLong startRaceTime = new AtomicLong(0);
    public static void main(String[] args) {
        List<RaceCarRunnable> cars = new ArrayList<RaceCarRunnable>();
        cars.add(new RaceCarRunnable("Toyota Supra", 220, 2000));
        cars.add(new RaceCarRunnable("Ford Mustang", 226, 2210));
        cars.add(new RaceCarRunnable("Reno Duster", 160, 1800));

        List<Thread> threads = new ArrayList<Thread>();
        for (RaceCarRunnable car: cars){
            threads.add(new Thread(car));
        }

        startRace(cars);
    }
    static void startRace(List<RaceCarRunnable> cars){
        CountDownLatch startLatch = new CountDownLatch(1);

        Thread startThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("3...");
                    Thread.sleep(500);
                    System.out.println("2...");
                    Thread.sleep(500);
                    System.out.println("1...");
                    Thread.sleep(500);
                    System.out.println("GO!!!");

                    // Разрешаем начало гонки после "GO!!!"
                    startRaceTime.set(System.currentTimeMillis());
                    startLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        startThread.start();

        try {
            startLatch.await(); // Ожидаем начала гонки
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        CountDownLatch finishLatch = new CountDownLatch(cars.size());

        for (RaceCarRunnable raceCar : cars) {
            raceCar.setLatch(finishLatch);
            new Thread(raceCar).start();
        }
        try {
            finishLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Race finished!");

        RaceCarRunnable winner = getWinner(cars);
        System.out.println("Winner: " + winner.getName() + ", Time: " + convertToTime(winner.getFinishTime()) + " ms");
    }
    public static String convertToTime(long time) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        Date date = new Date(time);
        return dateFormat.format(date);
    }
    private static RaceCarRunnable getWinner(List<RaceCarRunnable> cars) {
        RaceCarRunnable winner = null;
        long bestTime = Long.MAX_VALUE;

        for (RaceCarRunnable raceCar : cars) {
            long finishTime = raceCar.getFinishTime();
            if (finishTime < bestTime) {
                bestTime = finishTime;
                winner = raceCar;
            }
        }

        return winner;
    }
}
