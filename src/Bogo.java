import java.util.Random;
public class Bogo extends UsefulMethods {
//THIS SORTING ALGORITHM IS UNDER DEVELOPMENT
      public  void BogoSort(int[] array) {
       Random rd=new Random();
        boolean sorted = false;
         while (sorted == false) {
            RandomIndexSwap(array,rd);
            if (CheckSort(array) == true) {
                sorted = true;
            }
        }
    }

    /*
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int[] array;
        boolean Sorted = false;


        public void CreateArray() { //create the array and populate it with values
            this.array = new int[sc.nextInt()];
            System.out.println("value of array is:" + array.length);
            for (int x = 0; x < array.length; x++) {
                System.out.print(x + "index:");
                this.array[x] = rd.nextInt(89);
            }
        }
    */
    public void RandomIndexSwap(int[] array,Random rd) {//firstly create create 2 different indexes and then swap values of them
        for (int x = 0; x < array.length; x++) {
            int random1 = rd.nextInt(array.length);
            int random2 = NextRandom(random1,array,rd);
            Swap(random1, random2,array);
        }
    }

    public int NextRandom(int random1,int[] array,Random rd) {
        int temp = rd.nextInt(array.length);
        while (temp == random1) {
            temp = rd.nextInt(array.length);
        }
        return temp;
    }//finds another random index different from the first one

    public void Swap(int first, int second,int[] array) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public boolean CheckSort(int[] array) {
        for (int i = 0; i < array.length; i++) ;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false; // It is proven that the array is not sorted.
            }
    }
        return true;
    }

    public long GetAverageTime(int size){
        long ElapsedTime=0;
        for(int i =0; i <=10; i ++){
            int[] bogo = new int[size];
            bogo =FillArray(size);
            super.StartTime();
            BogoSort(bogo);
            super.GetTime();
            ElapsedTime=ElapsedTime+ this.TimeElapsed;
        }

        long AverageTime = ElapsedTime;
        return AverageTime;
    }
}

