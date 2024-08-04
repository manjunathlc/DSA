package arrays;

import static arrays.EvenOddShift.printArray;

public class RotateArray {
    public static void rotateArrayLeft(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        printArray(arr);
        System.out.println();
    }

    public static void rotateArrayRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        printArray(arr);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        printArray(arr);

        System.out.println("Array rotated to the left: ");
        rotateArrayLeft(arr);

        System.out.println("Array rotated to the right: ");
        rotateArrayRight(arr);
    }

}
