package group_tasks.week4;

import java.util.Arrays;

public class SameLetters {

    public static boolean same_letters(String str1,String str2){
        String[]arr1=str1.split("");
        System.out.println(Arrays.toString(arr1));
        String[]arr2=str2.split("");
        System.out.println(Arrays.toString(arr2));
        if(arr1.length!= arr2.length){

            System.err.println("word length must be same");
           return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(same_letters("abc", "abc"));
        /*1- String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:*/


    }
}
