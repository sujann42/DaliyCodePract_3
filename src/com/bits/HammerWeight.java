package com.bits;

public class HammerWeight {
    public static int hammingWeight(int n){
        int sum = 0;
        while(n != 0){
            sum++;
            n = n & (n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 00000000000000000000000000101011;
        System.out.println(hammingWeight(n));
    }
}
