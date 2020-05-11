package com.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingNumInArray {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        int x = 1;
        sumArray(arr, x);
    }

    public static void sumArray(int[] A, int K) {
        List<Double> newList = new ArrayList<>();

        double sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i] * Math.pow(10, A.length - i - 1);
        }
        double newNum = sum + K;
        System.out.println("Sum is: "+sum);
        System.out.println("Sum + K is: "+newNum);

        while(newNum > 0){
            newList.add(newNum%10);
            newNum /= 10;
        }

        Collections.reverse(newList);
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> newList = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i] * Math.pow(10, A.length - i - 1);
        }
        int newNum = sum + K;
        System.out.println(sum);
        System.out.println(newNum);

        while(newNum > 0){
            newList.add(newNum%10);
            newNum /= 10;
        }
        Collections.reverse(newList);
        return newList;
    }
}


/*


    for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
*/
