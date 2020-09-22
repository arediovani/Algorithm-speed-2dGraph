public class Quick extends UsefulMethods {

    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];

                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];

        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    void Quick(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            Quick(arr, low, pi-1);
            Quick(arr, pi+1, high);
        }
    }


    @Override
    public long GetAverageTime(int size) {
        long ElapsedTime=0;
        for(int i =0; i <=10; i ++){
            int[] quick = new int[size];
            quick =FillArray(size);
            super.StartTime();
            Quick(quick,0,quick.length-1);
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

