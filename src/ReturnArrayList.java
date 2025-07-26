import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReturnArrayList {
    public static void main(String[] args) {
        System.out.println(indexOfTarget(new ArrayList<>(),0,3, new int[]{1,2,3,3,3,4}));
    }
    static ArrayList<Integer> indexOfTarget(ArrayList<Integer> list, int index, int target, int [] arr){
        if(arr.length==0) list.add(-1);
        if(index== arr.length) {
        return list;}
        if(arr[index]==target) list.add(index);
        return indexOfTarget(list,index+1,target,arr);
    }
}