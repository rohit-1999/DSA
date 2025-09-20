import java.util.ArrayList;
import java.util.List;

public class Subarray {
    public static void main(String[] args) {
        int nums[] = new int[] {1,2,3};
        System.out.println(convert(nums));
        int nums1[] = new int[] {1,2,2};
        System.out.print(convertDuplicate(nums1));

    }
    public static List<List<Integer>> convert(int []arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
            List<Integer> inner = new ArrayList<>(outer.get(i));
            inner.add(num);
            outer.add(inner);
            }
        }

        return outer;
    }
    public static List<List<Integer>> convertDuplicate(int []arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0;
        int end=0;
        for(int i=0;i<arr.length; i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end = outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }
}
