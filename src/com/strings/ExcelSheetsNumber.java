package com.strings;

public class ExcelSheetsNumber {
    public static String convertToTitle(int n) {
        String result = "";
        String[] alpha = {"", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        if(n<=26){
            return alpha[n];
        }
        result = alpha[n/26];
        System.out.println("Here result: "+result);
        n = (n-1) % 26;
        System.out.println("Here N is: "+ n);
        result += alpha[n];
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(51));

    }
}
