package arrays;

public class KandanesAlgorithm {
    public static int maxSubArray(int[] arr){
        int MAX=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>MAX){
                MAX=arr[i];
            }
            if(sum<0){
                sum=0;
            }
        }
        return MAX;
    }

    public static void main(String[] args){
        int[] a1={1,-2,-5,-9};
        int[] a2={5,9,5,3,2,1,4};
        System.out.println(maxSubArray(a1));
        System.out.println();
        System.out.println(maxSubArray(a2));
    }
}
