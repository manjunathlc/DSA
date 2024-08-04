package arrays;

import static arrays.EvenOddShift.printArray;

public class ShiftOfZeros {
    public static void shiftZerosToRight(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        printArray(arr);
    }

    public static void shiftZerosToLeft(int[] arr){     // 1 2 0 0 3 0 4 0 5
        int[] result=new int[arr.length];
        int j=arr.length-1;
        for (int i = result.length-1; i >=0 ; i--) {
            if(arr[i]!=0){
                result[j--]=arr[i];
            }
        }
        printArray(result);

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0, 5};
        shiftZerosToRight(arr);  // Output: 1 2 3 4 5 0 0 0 0 0
        System.out.println("------------------------------------");
        shiftZerosToLeft(arr);

    }
}
