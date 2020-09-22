import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

/**
 * @author raowei
 * @create 2020-09-22-8:23
 */
public class findRadius_475_2 {
    public static void main(String[] args) {
        int[] house = {1,2,3,5,15};
        int[] heater = {2, 30};
        System.out.println("begin");
        System.out.println(findRadius(house, heater));
    }

    public static int findRadius(int[] houses, int[] heaters) {
        // use two pointers to follow arrays, find the biggest value of radius

        Arrays.sort(houses);
        Arrays.sort(heaters);

        if(heaters[0] >= houses[houses.length - 1]){
            return heaters[0] - houses[0];
        }
        if(heaters[heaters.length - 1] <= houses[0]){
            return houses[houses.length - 1] - heaters[heaters.length - 1];
        }

        int i = 0;
        int j = 0;
        int radius = 0;

        // in case [1,2,3]  [2]
        //

        if(houses [0] < heaters[0]){
            radius = heaters[0] - houses[0];
        }

        while(houses[i] <= heaters[j]){
            i++;
        }

        while(i < houses.length && j < heaters.length - 1){
            if(houses[i] <= heaters[j + 1]){
               radius = Math.max(radius, Math.min(houses[i] - heaters[j], heaters[j + 1] - houses[i]));
               i++;

            }else{
                j++;
            }
        }

        // the biggest value of heaters is smaller than houses
        if(i < houses.length){
            radius = Math.max(radius, houses[houses.length - 1] - heaters[heaters.length - 1]);
        }

        return radius;

    }



    }
