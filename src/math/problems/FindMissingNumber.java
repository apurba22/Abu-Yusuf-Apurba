package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int exceptvalue = exception(10);
        missingNum(array, exceptvalue);


    }

    public static int missingNum(int[]array,int exception){
        int missingNumber;
        int sum = 0;
        for(int n: array){
            sum += n;
        }

        missingNumber = exception -sum;
        System.out.println("The mising num is "+ missingNumber);
        return missingNumber;
    }


    public static int exception (int n){
        int sum = 0;
        int []array = new int[n];
        for(int i=0; i<array.length;i++){
            array[i] = i+1;
        }
        for(int s:array){
            sum+=s;
        }
        return sum;
    }
}



