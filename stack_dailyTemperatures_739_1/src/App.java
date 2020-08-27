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
        if (len < 2) {
            results[0] = 0;
            return results;
        }
        results[len - 1] = 0;
        int cnt = 0;

        for (int i = len - 2; i >= 0; i--) {
            cnt = 1;
            while(T[i] >= T[i + cnt] && results[i + cnt] != 0){
                cnt += results[i+cnt];
            }
            if(results[i + cnt] == 0 && T[i] >= T[i + cnt]){
                results[i] = 0;
                continue;
            }
            results[i] = cnt;
        }

        return results;
    }
}
