package com.numbers;

public class SumOfSquareNum {
    public static boolean judgeSquareSum(int c) {
        if (c == 0) {
            return true;
        }
        int max = (int) Math.ceil(Math.sqrt(c));

        for (int i = 0; i < max; i++) {
            int first = c - i * i;
            int sec = (int) (Math.sqrt(first));
            if (sec * sec == first) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(8));
    }
}
