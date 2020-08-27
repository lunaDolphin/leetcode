import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] results = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(results));
    }

    public static int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] results = new int[len];
        if(len < 2) {
            results[0] = 0;
            return results;
        }

        for(int i = 0 ; i < len - 1; i++){
            for(int j = i + 1; j < len; j++){
                if(T[i] < T[j]){
                    results[i] = j - i;
                    break;
                }
                if(j == len){
                    results[i] = 0;
                }
            }
        }

        results[len - 1] = 0;

        return results;
    }
}
