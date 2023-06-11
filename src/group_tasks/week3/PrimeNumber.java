package week3;

import java.util.Scanner;

public class PrimeNumber {


    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is prime number.");
        } else {
            System.out.println(number + " is not prime number.");
        }

    }
}
/*
1-Numbers -- Prime Number
Write a method that can check if a number is prime or not.
 */
