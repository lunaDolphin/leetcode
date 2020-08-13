import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,0,2,0,1,0,2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                cnt0++;
            }
            if(nums[i] == 1){
                cnt1++;
            }
            if(nums[i] == 2){
                cnt2++;
            }
        }
        for(; index < cnt0; index++){
            nums[index] = 0;
        }
        for(;index < cnt0 + cnt1; index++){
            nums[index] = 1;
        }
        for(;index < cnt0 + cnt1 + cnt2; index++){
            nums[index] = 2;
        }
    }
}
