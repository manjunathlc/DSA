package arrays;

import java.util.Arrays;

public class SearchElement {
    public static int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static boolean linearSearch(int[] arr, int x) {
        for (int j : arr)
            if (j == x)
                return true;
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3,20, 4, 10, 5, 40 };
        int x = 10;
        Arrays.sort(arr); // Sorting the array for binary search to work efficiently.
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at index " + result);
        System.out.println();

        boolean isFound = linearSearch(arr, x);
        System.out.println("Element found in array: " + isFound);

    }
}
