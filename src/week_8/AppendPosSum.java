package week_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppendPosSum {
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {


        int sum = 0;
        ArrayList<Integer> negative = new ArrayList<>();
        for (Integer each : list) {
            if (each > 0) {
                sum += each;

            }
            if (each < 0) {
                negative.add(each);

            }

        }
        //System.out.println(negative);
        list.removeAll(negative);
        list.add(sum);
        //System.out.println(list);


        return list;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, -2, 3, -5, 4, 6, -1));
        System.out.println(appendPosSum(list));
//        int sum=0;
//        ArrayList<Integer> negative= new ArrayList<>();
//        for (Integer each : list) {
//            if(each >0){
//                sum+=each;
//
//            }
//            if(each<0){
//               negative.add(each);
//
//            }
//
//        }
//        //System.out.println(negative);
//        list.removeAll(negative);
//        list.add(sum);
//        //System.out.println(list);

    }
}
