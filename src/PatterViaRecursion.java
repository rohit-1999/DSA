//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PatterViaRecursion {
    public static void main(String[] args) {

        pattern(4,0);
    }
    static void pattern(int r, int c){
        if(r==0) return;
       if(c<r){
           pattern(r,c+1);
           System.out.print("*");
       }
       else{
           pattern(r-1,0);
           System.out.println();
       }
    }
}