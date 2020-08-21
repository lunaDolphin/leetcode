

public class App {
    public static void main(String[] args) throws Exception {
        // int[] testData = { 3, 30, 34, 5, 9 };
        // int [] testData = {999999998,999999997,999999999};
        // int[] testData = {3, 30};
        // int[] testData = { 1,2,3,4,5,6,7,8,9,0};
        int[] testData = { 1,2,0};

        System.out.println(minNumber(testData));
    }

    public static String minNumber(int[] nums) {
        int len = nums.length;
       

        quickSort(nums, 0, len - 1);

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < len; j++){
            sb.append(nums[j]);
        }
     
        return sb.toString();
    }

    public static void quickSort(int[]data, int s, int e){
        if(s >= e) return;

        int i = s;
        int j = e;
        int buf = data[e];

        while(i < j){
            // data[i] > data[e]  return true
            if(compareInt(data[e], data[i])){
                i++;
            } else if(compareInt(data[j],data[e])){
                j--;
            } else {
                int tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
            }
        }
        data[e] = data[i];
        data[i] = buf;

        quickSort(data, s, i - 1);
        quickSort(data, i + 1, e);
    }

    public static boolean compareInt(int m, int n){
        if(m == 0){
            return false;
        }
        if(n == 0){
            return true;
        }

        int lenm = 0;
        int lenn = 0;

        int a = m;
        int b = n;

        while(a > 0){
            a = a / 10;
            lenm++;
        }

        while(b > 0){
            b = b / 10;
            lenn++;
        }

        double totalA = m * Math.pow(10, lenn) + n;
        double totalB = n * Math.pow(10, lenm) + m;

        return totalA - totalB >= 0;
    }
}
