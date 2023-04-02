package week_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorted {
    public static boolean isSorted(ArrayList<Integer> nums) {
        ArrayList<Integer> sortedList = new ArrayList<>();
        int j=1;
        for (int i = 0; i < nums.size()-1; i++,j++) {

            if (nums.get(i) > nums.get(j)) {


                return false;
            }

        }
        return true;
    }

    /*### Finish the method called `isSorted()` that will take an `ArrayList<Integer>` argument `nums` and returns a `boolean`.
     Determine if `nums` is sorted by returning `true` when it is sorted and `false` when it is not sorted.
      Sorted order is smallest to largest.
    The `isSorted()` method is already called in the main method with an argument.

#### This is a `return` method with an `ArrayList<Integer>` parameter

Main topics: methods, Scanner, ArrayList, loops, methods

Example:
```
isSorted([1, 5, 5, 8, 6])

output:
	false
```
Example:
```
isSorted([0, 0, 3, 5, 8])

output:
	true
```
Example:
```
isSorted([1, 2, 5, 4])

output:
	false
```*/
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList( 1, 2, 3, 1,4, 5, 6, 7));
        System.out.println(isSorted(nums));
    }
}
