public class Merge extends UsefulMethods {

    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r) {

        if (l < r) {

            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

 /*   public long GetAverageTime(int size) {
        long ElapsedTime = 0;
        for (int i = 0; i <= 10; i++) {
            int[] merge = new int[size];
            merge = FillArray(size);
            this.StartTime = System.nanoTime();
            bubbleSort(bubble);
            long TimeElapsed = System.nanoTime() - StartTime;
            super.GetTime();
            ElapsedTime = ElapsedTime + TimeElapsed;
        }

        long AverageTime = ElapsedTime;
        return AverageTime;
    }
    //   MergeSort ob = new MergeSort();
    // ob.sort(arr, 0, arr.length-1);
*/
@Override
    public long GetAverageTime(int size) {
        long ElapsedTime = 0;
        for (int i = 0; i <= 10; i++) {
            int[] merge = new int[size];
            merge = FillArray(size);
            super.StartTime();
            sort(merge, 0, merge.length - 1);
            super.GetTime();
            ElapsedTime = ElapsedTime + this.TimeElapsed;
        }

        long AverageTime = ElapsedTime;
    if (AverageTime<=500000){
        return AverageTime;}
    else{
        return AverageTime=500000;
    }

  //  return AverageTime;
    }


}
