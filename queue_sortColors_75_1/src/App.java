import java.util.Arrays;

public class App {

    public static void main(String[] args) throws Exception {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int ps = 0;
        int pe = nums.length - 1;
        int cur = 0;

        for(; cur <= pe; ){
            if(nums[cur] == 0){ 
                // exchange(nums[cur], nums[ps]);
                nums[cur] = nums[ps];
                nums[ps] = 0;
                ps++;
                cur++;
                continue;
            }
            if(nums[cur] == 2){
                // exchange(nums[cur],nums[pe]);
                nums[cur] = nums[pe];
                nums[pe] = 2;
                pe--;
                continue;
            } 
            
            if(nums[cur ] == 1){
                cur++;
                // continue;
            }
            
        }
    }

    // public static void exchange(int nums[m], nums[n]){
    //     // m = m^n;
    //     // n = m^n;
    //     // m = m^n;
    //     int buf = m;
    //     m = n;
    //     n = buf;
    // }
}
