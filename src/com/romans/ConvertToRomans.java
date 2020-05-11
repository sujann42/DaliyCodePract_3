package com.romans;

public class ConvertToRomans {
    public static String convToRoman(int n) {

        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "XC", "XCC", "XCCC", "XC"};
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] m = {"", "M", "MM", "MMM"};

        return m[n / 1000] + c[(n % 1000) / 100] + x[(n % 100) / 10] + i[(n % 10)];
    }

    public static void main(String[] args) {
        System.out.println(convToRoman(9));
    }
}
