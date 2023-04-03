package week_8;

import java.util.ArrayList;
import java.util.Arrays;

public class DeliveryRefuel {
    public static int refuels(ArrayList<Integer> deliveries, int gasTank) {
        int sumFuel = 0;
        for (int eachDelivery : deliveries) {
            sumFuel += eachDelivery / gasTank;
            if(gasTank>eachDelivery){
                sumFuel++;
            }
        }

return sumFuel;
    }

    public static void main(String[] args) {
        ArrayList<Integer> deliveries = new ArrayList<>(Arrays.asList(2, 3, 9));
        System.out.println(refuels(deliveries, 1));

    }
}
