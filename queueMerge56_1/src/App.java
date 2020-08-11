import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        int[][] testData = {{1,3},{2,6},{8,10},{0,1}};
        // System.out.println("1:" + merge(testData).toString());
        // System.out.println("2:" + Arrays.toString(merge(testData)));
        System.out.println("3:" + Arrays.deepToString(merge(testData)));
        // for(int i = 0; i < merge(testData).length; i++){
        //     System.out.println("4:" + Arrays.toString(merge(testData)[i]));
        // }
        
    }

    public static int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if(len < 2){
            return intervals;
        }
        int index = 0;
        
        for(int i = 0; i < len - 1; i++){
            for(int j = i + 1; j < len; j++){
                if(intervals[j][0] <= intervals[i][1] && intervals[i][0] <= intervals[j][1]){
                    intervals[j][0] = Math.min(intervals[i][0], intervals[j][0]);
                    intervals[j][1] = Math.max(intervals[j][1], intervals[i][1]);
                    intervals[i] = null;
                    index++;
                    System.out.println(Arrays.toString(intervals[j]));
                    break;
                }
            }

        }

        int res[][] = new int[len - index][2];
        int cnt = 0;
        for(int j = 0 ; j < len; j++){
            if(intervals[j] != null){
                res[cnt][0] = intervals[j][0];
                res[cnt++][1] = intervals[j][1];
            }
            
        }
        return res;
}
}
