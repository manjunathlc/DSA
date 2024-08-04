package arrays;

public class SecondLargest {
    public static void secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }
        }

        System.out.println("Second largest number: " + secondMax);
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50,60,50, 41, 60,60};
        secondLargest(arr);
    }

}
