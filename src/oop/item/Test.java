package oop.item;

import oop.item.Item;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Item item = new Item(input.nextLine(), input.nextDouble());
        System.out.println(item);
    }
}
