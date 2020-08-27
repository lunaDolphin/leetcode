import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] results = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(results));
    }

    public static int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] results = new int[len];
        // if (len < 2) {
        //     results[0] = 0;
        //     return results;
        // }
        // results[len - 1] = 0;
        // int cnt = 0;

        for (int i = len - 2; i >= 0; i--) {
            int cnt = 1;
            while(true){
                if(T[i] < T[i + cnt]){
                    results[i] = cnt;
                    break;
                } else if(results[i + cnt] == 0){
                    results[i] = 0;
                    break;
                }
            
            cnt += results[i+cnt];}
        }

        return results;
    }
}
