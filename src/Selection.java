public class Selection extends UsefulMethods {

    public Selection() {
    }

    void SelectionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    @Override
    public long GetAverageTime(int size) {
        long ElapsedTime=0;
        for(int i =0; i <=10; i ++){
            int[] selection = new int[size];
            selection =FillArray(size);
            super.StartTime();
            SelectionSort(selection);
            super.GetTime();
            ElapsedTime=ElapsedTime+ this.TimeElapsed;
        }

        long AverageTime = ElapsedTime;
        if (AverageTime<=500000){
            return AverageTime;}
        else{
            return AverageTime=500000;
        }

    }
}
