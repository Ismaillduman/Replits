package eu7Arrays;

import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        /*Given values: [[1, 2, 3], [5, 33, 9]]

output: [[33, 33, 33], [33, 33, 33]]
```*/int max= Integer.MIN_VALUE;
        int [][] nums= {{1,2,3},{5,33,9}};
        for (int[] num : nums) {
            for (int eachNum : num) {
                if(eachNum>max){
                    max=eachNum;
                }

            }
        }
        for (int[] num : nums) {
            Arrays.fill(num, max);
            System.out.println(Arrays.toString(num));
        }

    }
}
