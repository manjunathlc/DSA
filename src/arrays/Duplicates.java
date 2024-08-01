package arrays;

public class Duplicates {
    public static void printDuplicates(int[] arr) {
//        int[] result = new int[arr.length];
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (isDuplicate) {
//                result[count++] = arr[i];
//            }
//        }
//
//        for (int i = 0; i < count; i++) {
//            System.out.print(result[i] + " ");
//        }


//        int[] result = new int[arr.length];
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (isDuplicate) {
//                result[count++] = arr[i];
//            }
//        }
//
//        return result;


        for (int i = 0; i < arr.length; i++) {
            int c = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                    arr[j] = -1;
                }
            }
            if (arr[i] != -1 && c > 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int c = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                    arr[j] = -1;
                }
            }
            if (arr[i] != -1 && c == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void removeDuplicates(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int c=1;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] ==arr[j]){
                    c++;
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1 ){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void printFrequencies(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int c = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                    arr[j] = -1;
                }
            }
            if (arr[i]!= -1 ) {
                System.out.println(arr[i] + " occurs " + c + " times");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 9, 4, 9, 6 };
        printDuplicates(arr);
        printUnique(arr);
        removeDuplicates(arr);
        printFrequencies(arr);
    }
}
