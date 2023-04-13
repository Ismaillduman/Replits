package eu7Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DiagonalDifference {
    public static void main(String[] args) {
        int sumLeftToRight = 0;
        int sumRightToLeft = 0;
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums.length; k++) {
                if (i == 0 && k == 0) {

                    sumLeftToRight += nums[i][k];
                }
                if (i == 1 && k==1) {
                    sumLeftToRight+=nums[i][k];
                }
                if(i==2&&k==2){
                    sumLeftToRight+=nums[i][k];
                }
            }
        }

        for (int j = 0; j < nums.length; j++) {
            for (int k = 0; k < nums.length; k++) {
                if (j == 0 && k == 2) {

                    sumRightToLeft += nums[j][k];
                }
                if (j == 1 && k==1) {
                    sumRightToLeft+=nums[j][k];
                }
                if(j==2&&k==0){
                    sumRightToLeft+=nums[j][k];
                }
            }
        }
        int diagonalDifference= sumRightToLeft-sumLeftToRight;
        System.out.println(Math.abs(diagonalDifference));
        /*
1 2 3
4 5 6
9 8 9
```

The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal =  3+5+9 = 17.
Their absolute difference is |15-17| = 2*/
    }
}
