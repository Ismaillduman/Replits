package week_8;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfNumeralOnNumber {

    public static ArrayList<Integer> getSum(ArrayList<String> digits){
        ArrayList<Integer> sumDigit= new ArrayList<>();
        for (String each : digits) {
            int sumOfNum=0;
            String[]nums=each.split("");
            for (String eachNum : nums) {
                sumOfNum+=Integer.parseInt(eachNum);

            }
            sumDigit.addAll(Arrays.asList(sumOfNum));
        }




return sumDigit;
    }
    public static void main(String[] args) {
ArrayList<String> list= new ArrayList<>(Arrays.asList("12345","1458"));
        System.out.println(getSum(list));
    }
}
