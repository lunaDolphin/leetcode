/**
 * @author raowei
 * @create 2020-09-18-9:05
 */
public class fibonacci_leetcode_509 {
    public static void main(String[] args) {
        System.out.println(fib(30));
    }

    public static int fib(int n) {
        if(n < 2) return n;

        int[] buf = new int[n + 1];
        buf[0] = 0;
        buf [1] = 1;
        int index = 2;

        while(index <= n){
            buf[index] = buf[index - 1] + buf[index - 2];
            index++;
        }
        return buf[n];
    }
}
