package com.cacat;

import java.util.Arrays;

/**
 * Created by Andu on 18.05.2018.
 */
public class ReverseArray {
    private static int[] arei = {1, 2, 3, 4, 5, 6};
    private static int[] areiInvers = new int[arei.length];
    private static int i;

//    public int[] intoarce() {
//        for (i=arei.length-1; i==0; i--) {
//            areiInvers[counter] = arei[i];
//            counter++;
//        }
//        return areiInvers;
//    }

    public static void main(String[] args) {
        for (i = 0; i < arei.length / 2; i++) {
            int temp = arei[i];
            areiInvers[i] = arei[arei.length - 1 - i];
            areiInvers[arei.length - 1 - i] = temp;
        }
//        int[] arei = {1, 2, 3, 4, 5};
//        int[] areiInvers = new int[arei.length];
//        int counter = 0;
//        int i;
//        for (i = arei.length-1; i == 0; i--) {
//            areiInvers[counter] = arei[i];
//            counter = counter+5;
//        }
//        System.out.println(arei[i]);
//        System.out.println(areiInvers[counter]);
//
//        areis.stream(arei).forEach(System.out::print);
//        System.out.print("---------");
//        areis.stream(areiInvers).forEach(System.out::print);
//        intorcator.intoarce();

        System.out.println("Arei:");
        Arrays.stream(arei).forEach(System.out::print);
        System.out.println();
        System.out.println("AreiInvers:");
        Arrays.stream(areiInvers).forEach(System.out::print);
    }
}