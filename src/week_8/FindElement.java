package week_8;

import java.util.ArrayList;
import java.util.Arrays;

public class FindElement {
    public static String findElement(ArrayList<String> list,String find){
        for (String eachWord : list) {
            if(eachWord.contains(find)){
                find=eachWord;
                return find;
            }

        }
        return "search failed";
    }
    public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>(Arrays.asList("java","c++","javascript","css ist eine software Begriefe","HTML"));
        System.out.println(findElement(list, "waren"));
    }
}
