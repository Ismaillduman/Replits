package week_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapElement {
 public static ArrayList<String> swap(ArrayList<String> list,int index1,int index2){
     Collections.swap(list,index1,index2);
        return list;
    }
    public static void main(String[] args) {
        ArrayList<String> letters= new ArrayList<>(Arrays.asList("a","b","c","d"));
        swap(letters,0,letters.size()-1);
        System.out.println(letters);



    }
}
