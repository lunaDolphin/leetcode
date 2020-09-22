import javax.swing.text.StyledEditorKit;
import java.util.Arrays;

/**
 * @author raowei
 * @create 2020-09-19-8:18
 */
public class findRadius_475 {
    public static void main(String[] args) {
        int[] house = {1,2,3,5,15};
        int[] heater = {2, 30};
        System.out.println("begin");
        System.out.println(findRadius(house, heater));
    }

    public static int findRadius(int[] houses, int[] heaters) {
        // find the max value of the shortest distance between houses and their heaters
        int max = -1;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        for (int i = 0; i < houses.length; i++) {
            int buf = houses[i];
            int min ;
            if(buf <= heaters[0]){
                min = heaters[0] - buf;
            } else if(buf >= heaters[heaters.length - 1]){
                min = buf - heaters[heaters.length - 1];
            } else {
                min = shortest(houses[i], heaters);
            }
           max = Math.max(min, max);
        }

        return max;
    }

    public  static int shortest(int house, int[] heaters){
       int h = heaters.length - 1;
       int l = 0;

       while(l <= h){
           int mid = l + ((h - l )>> 1);
           if(heaters[mid] > house){
               if(heaters[mid - 1] < house){
                   return Math.min(heaters[mid] - house, house - heaters[mid - 1]);
               } else {
                   h = mid - 1;
               }
           }else if(heaters[mid] < house){
               l = mid + 1;
           }else{
                return 0;
           }
       }

        return -1;


    }
}
