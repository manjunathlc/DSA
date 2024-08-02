package arrays;

public class mergeTwoArrays {
    public static void mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        System.out.println("Merged array:");
        for (int n : mergedArray) {
            System.out.print(n + " ");
        }
    }

    //if Arrays size are same
    public static void mergeArraysSameSize(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            mergedArray[k++] = arr1[i++];
            mergedArray[k++] = arr2[j++];
        }

        System.out.println("Merged array:");
        for (int n : mergedArray) {
            System.out.print(n + " ");
        }
    }

    //if Arrays size are not same
    public static void mergeArraysDifferentSize(int[] arr1, int[] arr2) {
        int j=0;
        int[] res=new int[arr1.length+arr2.length];
        for(int i=0;i<res.length;i++) {
            if(i<arr1.length) {
                res[i]=arr1[i];
            }
            else {
                res[i]=arr2[j];
                j++;
            }
        }
        System.out.println("Merged array:");
        for(int n:res) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        mergeArrays(arr1, arr2);
        mergeArraysSameSize(arr1, arr2);
        mergeArraysDifferentSize(arr1, arr2);
    }
}
