//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SortedorNot {
    public static void main(String[] args) {

        System.out.println("Array is sorted "+sorted(new int[]{1,2,3,3,5,4,5},0));
    }
    static boolean sorted(int []arr, int index){
        if(index==arr.length-1) return true;
        return arr[index]<=arr[index+1] && sorted(arr, index+1);
    }
}