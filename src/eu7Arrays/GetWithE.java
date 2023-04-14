package eu7Arrays;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.ArrayList;
import java.util.Arrays;

public class GetWithE {
    public static void main(String[] args) {
        String[] arr = {"Hello", "Hi", "yes", "no","ee"};
        System.out.println(getWithE(arr));
    }

    public static ArrayList<String> getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

        ArrayList<String> fewValues= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().contains("e")){
                fewValues.add(arr[i]);
            }
        }


        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }
}
