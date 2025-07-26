public class ProductOfDigits {
    public static void main(String [] args){
        System.out.println(productDigits(1342));
    }
    static int productDigits(int n){
        if(n%10==n) return n;
        return n%10 * productDigits((n/10));
    }
}
