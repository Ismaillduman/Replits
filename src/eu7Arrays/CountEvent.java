package eu7Arrays;

public class CountEvent {
    public static void main(String[] args) {
        /*Given an array **nums**, count and print the number of even numbers in the array

Examples:

```
nums → [2, 1, 2, 3, 4]) → 3

nums → [2, 2, 0, 3, 5]) → 3

nums → [1, 3, 5, 7, 9]) → 0
```*/
        int[] nums= {2, 1, 2, 3, 4};
        int count=0;
        for (int eachNum : nums) {
            if(eachNum%2==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
