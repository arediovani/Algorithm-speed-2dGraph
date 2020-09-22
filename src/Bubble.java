import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Bubble extends UsefulMethods {
    public Bubble() {

    }

    static int[] bubbleSort(int[] arr) {

        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /*GetAverageTime is the Core of this project.
    */
    @Override
    public long GetAverageTime(int size) {
        //initialize an Elapsed time that will be returned in the end
        long ElapsedTime = 0;
        //Start the for loop so we can get an average of 10 sorts for each size
        for (int i = 0; i <= 10; i++) {
            int[] bubble = new int[size];
            bubble = FillArray(size);
            super.StartTime();
            bubbleSort(bubble);
            super.GetTime();
            ElapsedTime = ElapsedTime + this.TimeElapsed;
        }

        long AverageTime = ElapsedTime;
        if (AverageTime <= 500000) {
            return AverageTime;
        } else {
            return AverageTime = 500000;
        }

    }
}

