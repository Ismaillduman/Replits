package week_8;

import java.util.ArrayList;
import java.util.Arrays;


public class CombineArrays {
    public static ArrayList<String> combine(String[] r1, String[] r2){

        ArrayList<String > list = new ArrayList<>();
        list.addAll(Arrays.asList(r1));
        list.addAll(Arrays.asList(r2));

        return list;
    }


    public static void main(String[] args) {
        String[]arr1={"Busra","Yusuf"};
        String[]arr2={"Ismail","Zubeyde","Damla"};
        System.out.println(combine(arr1, arr2));
    }
}
