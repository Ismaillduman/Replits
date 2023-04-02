package week_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TimesTwo {
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
        // TODO: finish the method
        ArrayList<Integer> twoTimes= new ArrayList<>();
        for (int eachNum : nums) {
            eachNum*=2;
           twoTimes.add(eachNum);
        }


       // System.out.println(twoTimes);



return twoTimes;
    }
    public static void main(String[] args) {
ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,0));
        System.out.println(timesTwo(nums));
    }
}
