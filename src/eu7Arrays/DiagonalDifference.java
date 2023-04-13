package eu7Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DiagonalDifference {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums.length; k++) {
                if (i == 0 && k == 0) {

                    sum += nums[i][k];
                }
                if (i == 1 && k==1) {
                    sum+=nums[i][k];
                }
                if(i==2&&k==2){
                    sum+=nums[i][k];
                }
            }
        }
        System.out.println(sum);
        /*
1 2 3
4 5 6
9 8 9
```

The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal =  3+5+9 = 17.
Their absolute difference is |15-17| = 2*/
    }
}
