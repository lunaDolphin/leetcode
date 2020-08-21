import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        // int[] testData = { 3, 30, 34, 5, 9 };
        // int [] testData = {999999998,999999997,999999999};
        int[] testData = { 3,34,5,30};

        System.out.println(minNumber(testData));
    }

    public static String minNumber(int[] nums) {
        int len = nums.length;
        String[] buf = new String[len];

        for(int i = 0; i < nums.length; i++){
            buf[i] = String.valueOf(nums[i]);
        }

        quickSort(buf,0, len - 1);

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < len; j++){
            sb.append(String.valueOf(buf[j]));
        }
     
        return sb.toString();
    }

    public static void quickSort(String[] data, int p, int r){

        // if(p >= r) return;
        // int i = p, j = r;
        // String tmp = data[i];
        // while(i < j) {
        //     while((data[j] + data[p]).compareTo(data[p] + data[j]) >= 0 && i < j) j--;
        //     while((data[i] + data[p]).compareTo(data[p] + data[i]) <= 0 && i < j) i++;
        //     tmp = data[i];
        //     data[i] = data[j];
        //     data[j] = tmp;
        // }
        // data[i] = data[p];
        // data[p] = tmp;
        // quickSort(data, p, i - 1);
        // quickSort(data, i + 1, r);
    

        if(p >= r) return;

        int i = p;
        int j = r;

        while( i < j){
            while((data[i] + data[r]).compareTo(data[r] + data[i]) <= 0 && i < j){
                i++;
            } 
            
            while((data[j] + data[r]).compareTo(data[r] + data[j]) >= 0 && i < j){
                j--;
            } 
            
                String tmp = data[i];   
                data[i] = data[j];
                data[j] = tmp;
            
        }
        String buf = data[i];
        data[i] = data[r];
        data[r] = buf;


        quickSort(data, p, j - 1);
        quickSort(data, j + 1, r);
    }

 }
