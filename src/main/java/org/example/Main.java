package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Your number: ");

        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        SumCalculator sumCalculator = new SumCalculator();
        System.out.println(sumCalculator.sum(y));
    }
}