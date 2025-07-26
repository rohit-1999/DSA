import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CyclicBinarySearch {
    public static void main(String[] args) {
        int [] arr = new int[]{5,6,1,2,3,4};
        System.out.println(indexOfTarget(arr, 0,arr.length-1,1));
    }
    static int indexOfTarget(int [] arr, int s, int e, int target){
        if (s>e) return-1;
        int m =s+(e-s)/2;
        if(arr[m]==target) return m;

        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]) return indexOfTarget(arr,s,m-1,target);
            else return indexOfTarget(arr,m+1,e,target );
        }
        if(target>=arr[m] && target<=arr[e]) return indexOfTarget(arr,m+1,e,target);
        return indexOfTarget(arr, s, m-1, target);

    }
}