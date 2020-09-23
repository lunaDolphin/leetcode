/**
 * @author raowei
 * @create 2020-09-23-8:59
 */
public class mySqrt_69_1 {
    public static void main(String[] args) {
//        System.out.println(        Integer.MAX_VALUE        );
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        int low = 0;
        int high = x;
        int res = -1;

        while(low <= high){
            int mid  = low + ((high - low) >>1);

            if((long)mid * mid <= x){
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}
