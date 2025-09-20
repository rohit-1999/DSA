package twoPointer;

import java.util.Arrays;
import java.util.List;

public class twoSum {
    public static void main(String[] args) {
      int[] arr = new int[]{-1, 1, 5, 5, 7};
        System.out.println(twoSum(arr, 6));
    }
    public static int twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int count=0;
        int start=0;
        int end =arr.length-1;
        while(start<end){
            int ans=arr[start]+arr[end];
            if(ans==target) {count++;}
            else if(ans<target) start++;
            else end--;
        }
        return count;

    }
}
