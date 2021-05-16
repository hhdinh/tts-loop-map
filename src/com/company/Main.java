package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        ArrayList<Integer> inputs = new ArrayList<Integer>();

        int sum = 0;
        int product = 1;

        System.out.println("Input 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            inputs.add(userInput.nextInt());
        }

        userInput.close();

        System.out.println(inputs.toString());

        for (int i = 0; i < inputs.size(); i++) {
            sum += inputs.get(i);
            product *= inputs.get(i);
        }

        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);

        int max = Collections.max(inputs);
        System.out.println("Largest number is : " + max);

        int min = Collections.min(inputs);
        System.out.println("Smallest number is : " + min);

    }

}