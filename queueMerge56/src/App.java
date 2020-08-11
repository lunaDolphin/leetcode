import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static int[][] merge(int[][] intervals) {
        if(intervals.length < 2){
            return intervals;
        }
        int index = 0;
        int buf[][] = new int[1][2];
        
///queue the array in ascend
         Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] o1, int[]o2){
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        
        buf[0][1] = intervals[0][1];
        buf[0][0] = intervals[0][0];
        for(int i = 1; i < intervals.length; i++){
            if(i < intervals.length - 1){
                if(buf[0][1] < intervals[i][0]){
                     intervals[index][0]   = buf[0][0];
                     intervals[index++][1] = buf[0][1];

                     buf[0][0] = intervals[i][0];
                     buf[0][1] = intervals[i][1];
                 } else {
                    if(buf[0][1] > intervals[i][1]){
                        continue;
                     } else{
                        buf[0][1] = intervals[i][1];
                     }
                    }
            } else {
                if(buf[0][1] < intervals[i][0]){
                     intervals[index][0]   = buf[0][0];
                     intervals[index++][1] = buf[0][1];

                    intervals[index][0]   = intervals[i][0];
                    intervals[index++][1] = intervals[i][1];
                }else {
                    if(buf[0][1] > intervals[i][1]){
                        intervals[index][0]   = buf[0][0];
                        intervals[index++][1] = buf[0][1];
                     } else{
                        intervals[index][0]   = buf[0][0];
                        intervals[index++][1] = intervals[i][1];
                     }
                } 
            }

        }

        int res[][] = new int[index][2];
        for(int j = 0 ; j < index; j++){
            res[j][0] = intervals[j][0];
            res[j][1] = intervals[j][1];
        }
        return res;
    }
}
