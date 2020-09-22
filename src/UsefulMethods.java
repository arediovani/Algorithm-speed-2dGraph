import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class UsefulMethods {

    long StartTime;
    long TimeElapsed;

    public long GetTime() {
        return this.TimeElapsed = System.nanoTime() - StartTime;
    }

    public void StartTime() {
        this.StartTime = System.nanoTime();
    }

    public int[] FillArray(int size) {
        int[] Fill = new int[size];
        Random rd = new Random();
        for (int i = 0; i <= size - 1; i++) {
            Fill[i] = rd.nextInt(50);
        }
        return Fill;
    }
    public abstract long GetAverageTime(int size);


}
