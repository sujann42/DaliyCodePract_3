package com.numbers;

public class ReplacingCountNumbers {
    public static void main(String[] args) {
        System.out.println(integerReplacement(65535));
    }

    public static int integerReplacement(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                count++;
            } else {
                n -= 1;
                count++;
            }
        }
        return count;
    }
}
