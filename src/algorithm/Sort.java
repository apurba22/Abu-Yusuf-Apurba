package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        //implement here
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }





        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        
        
        return list;
    }
    

    public int [] mergeSort(int [] array,int low, int high){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        if(low < high) {
            int middle = (low + high)/2;
            mergeSort(array, low, middle);
            mergeSort(array, middle+1, high);
            mergeHalves(array, low, middle, high);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public void mergeHalves(int[] array, int low, int middle, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = middle + 1;
        int k = 0;

        while(left <= middle && right <= high) {
            if(array[left] < array[right]) {
                temp[k] = array[left];
                left++;
            } else {
                temp[k] = array[right];
                right++;
            }
            k++;
        }
        if(left <= middle) {
            while(left <= middle) {
                temp[k] = array[left];
                left++;
                k++;
            }
        } else if(right <= high) {
            while(right <= high) {
                temp[k] = array[right];
                right++;
                k++;
            }
        }
        for(int i = 0; i < temp.length; i++) {
            array[low + i] = temp[i];
        }
    }


    public int[] quickSort(int[] array, int low, int high) {          // quick sort
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if (low < high) {
            int next = partition (array, low, high);
            quickSort(array, low, next - 1);
            quickSort(array, next + 1, high);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int partition(int array[], int p, int r) {
        int part = p - 1;
        int pivot = array[r];
        for (int i = p; i <= r; i++) {
            if (array[i] <= pivot) {
                part++;
                if (part != i) {
                    array[part] = array[part] ^ array[i];
                    array[i] = array[part] ^ array[i];
                    array[part] = array[part] ^ array[i];
                }
            }
        }
        return part;

    }

    
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = array.length - 1; i >= 1; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public void heapify(int[] array, int n, int i) {
        int max;
        int child;
        child = 2 * i + 1;
        max = i;
        if (child < n)
            if (array[child] > array[max])
                max = child;
        if (child + 1 < n)
            if (array[child + 1] > array[max])
                max = child + 1;
        if (max != i) {
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
            heapify(array, n, max);
        }
    }



    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int maxVal = getMax(array);
        int[] bucket = new int[maxVal + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }
        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[outPos++] = i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }



    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
