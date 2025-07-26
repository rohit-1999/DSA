public class ReverseNumber {
    public static void main(String[] args) {
        reversDigits(1342);
        System.out.println(sum);
    }

    static int sum = 0;

    static void reversDigits(int n) {
        if (n == 0) return ;
        int rem = n%10;
        sum = sum*10 + rem;
        reversDigits(n/10);
    }
}

