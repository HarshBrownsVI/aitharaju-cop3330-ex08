/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */

import java.util.*;
public class Ex8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int ppl = 0;
        int pizzas = 0;
        int slices = 0;

        System.out.println("How many people?");
        ppl = kb.nextInt();

        System.out.println("How many pizzas do you have?");
        pizzas = kb.nextInt();

        System.out.println("How many slices per pizza?");
        slices = kb.nextInt();

        while(slices % 2 != 0){
            System.out.println("How many slices per pizza?");
            slices = kb.nextInt() * pizzas;
        }

        System.out.println(ppl + " people with " + pizzas + " pizzas ( " + slices + " slices)");
        System.out.println("Each person gets " + (slices/ppl) + " slices of pizza.");
        System.out.println("There are " + (slices%ppl) + " leftovers.");


    }

}