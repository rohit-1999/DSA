public class palindrome {

    public static void main(String[] args) {
    System.out.println( palindrom(12221));
    }

    static int reverse(int n){

        int digit =(int)Math.log10(n)+1;

        return helper(n,digit);

    }

    static int helper(int n, int digit){

        if(n==0) return 0;
        int rem = n%10;

        return (int)(rem*Math.pow(10, digit-1)) + helper(n/10,digit-1);

    }
    static boolean palindrom(int n){
        return n==reverse(n);
    }
}
