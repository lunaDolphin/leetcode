/**
 * @author raowei
 * @create 2020-09-18-8:46
 */
public class fibonacci_offer_10_1_1 {
    public static void main(String[] args) {
        System.out.println(fib(45));
    }

    public static int fib(int n) {
        if(n < 2) return n;

       int[] buf = new int[n + 1];
       buf[0] = 0;
       buf [1] = 1;
       int index = 2;

       while(index <= n){
           buf[index] = buf[index - 1]%1000000007 + buf[index - 2]%1000000007;
           index++;
       }
       return buf[n]%1000000007;
    }
}
