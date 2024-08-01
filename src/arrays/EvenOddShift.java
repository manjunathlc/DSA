package arrays;

public class EvenOddShift {
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static int[] evenOddShift(int[] arr) {
        int[] result = new int[arr.length];
        int j=0;
        int m=arr.length-1;
        int n=arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                result[j++]=arr[i];
            } else {
                result[m--]=arr[i];
            }
        }
        printArray(result);
        return result;
    }

    public static boolean isPrime(int num) {
        if(num==2 || num==3) return true;
        if(num%2==0 || num<=1 || num%3==0) return false;

        for(int i=5; i*i<=num; i=i+6) {
            if(num%i==0 || num%(i+2)==0) return false;
        }
        return true;
    }

    public static int[] printPrimeToFront(int[] arr) {
        int[] result = new int[arr.length];
        int j=0;
        int m=arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])){
                result[j++]=arr[i];
            }else {
                result[m--]=arr[i];
            }
        }
        printArray(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        evenOddShift(arr);
        printPrimeToFront(arr);
    }
}
