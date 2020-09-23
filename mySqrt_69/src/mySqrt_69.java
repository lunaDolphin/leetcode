/**
 * @author raowei
 * @create 2020-09-23-8:22
 */
public class mySqrt_69 {
    public static void main(String[] args) {
//        System.out.println(        Integer.MAX_VALUE        );
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        int low = 0;
        int high = x;


        while(low <= high){
            int mid  = low + ((high - low) >>1);

            if((long)mid * mid < x){
                low = mid + 1;
            } else if((long)mid * mid > x){
                if((long)(mid - 1) * (mid - 1) < x){
                    return mid - 1;
                }
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
