package com.strings;

public class ToLowerCases {
    public static void main(String[] args) {
        String str = "HeLLo";
        System.out.println(toLowerCase(str));
    }

    public static String toLowerCase(String str) {
        if(str.length() == 0){
            return "";
        }
        return str.toLowerCase();
    }
}
