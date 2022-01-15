package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

	int[] a = new int[6];
    double x = Math.random();
    System.out.println(x);
    Random r = new Random();

    for (int i=0; i < a.length; i++){

        a[i] = r.nextInt(bound:100);

    }

    printArray(a);






  //  Car bmw = new Car();
   // int aa = bmw.a;


    }

    public static void printArray(int[] x){

        for (int i=0; i < x.length; i++){

            System.out.print(x[i] + " ");

        }

    }
}
