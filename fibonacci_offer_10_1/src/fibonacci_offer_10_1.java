/**
 * @author raowei
 * @create 2020-09-18-8:36
 */
public class   fibonacci_offer_10_1 {
    private static int[] buf = new int[101];
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(buf[n] != 0) return buf[n];

        int first = fib(n - 1) % 1000000007;
        buf[n - 1] = first;
        int last = fib(n - 2) % 1000000007;
        buf[ n - 2] = last;
        return (first+ last)%1000000007;
    }
}
