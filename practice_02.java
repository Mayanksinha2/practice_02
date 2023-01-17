package com.internshala;

import java.util.Scanner;

public class practice_02 {
    public static void main(String[] args) {
        String name;
        float population;
        System.out.println("Enter your country name??");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Enter the population of your country?");
        population = sc.nextFloat();
        System.out.println(" Your country name is " + name + " and has a population over " + population + " billion ");

        sc.close();
    }
}