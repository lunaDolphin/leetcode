import java.util.Arrays;

/**
 * @author raowei
 * @create 2020-09-21-8:40
 */
public class findRadius_475_1 {

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
                    min = shortest(houses[i], heaters, 0, heaters.length - 1);
                }
                max = Math.max(min, max);
            }

            return max;
        }

        public  static int shortest(int house, int[] heaters, int low, int high){
           if(low > high) return -1;

            int mid = low + ((high - low )>> 1);

            if(heaters[mid] < house){
                return shortest(house, heaters, mid + 1, high);
            } else if(heaters[mid] > house){
                if(heaters[mid - 1] < house){
                    return Math.min(heaters[mid] - house, house - heaters[mid - 1]);
                } else {
                    return shortest(house, heaters, low, mid - 1);
                }
            } else {
                return 0;
            }

        }
    }




