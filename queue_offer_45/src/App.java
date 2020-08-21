import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        int[] testData = { 3, 30, 34, 5, 9 };
        // int [] testData = {999999998,999999997,999999999};

        System.out.println(minNumber(testData));
    }

    public static String minNumber(int[] nums) {
        int len = nums.length;
        String[] buf = new String[len];

        for(int i = 0; i < nums.length; i++){
            buf[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(buf, new Comparator<String>(){
            public int compare(String i, String j) {
                return (i + j).compareTo(j + i);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < len; j++){
            sb.append(buf[j]);
        }
     
        return sb.toString();
    }
}
