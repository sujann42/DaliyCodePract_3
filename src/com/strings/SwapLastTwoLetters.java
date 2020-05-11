package com.strings;

public class SwapLastTwoLetters {

    public static String swapLastTwo(String str) {
        //""->"" "A"->"A" "AB"->"BA" "RAIN"->"RANI"
        String result = "";
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        char last = str.charAt(str.length() - 1);
        char secondLast = str.charAt(str.length() - 2);
        if (str.length() > 2) {
            for (int i = 0; i < str.length() - 2; i++) {
                result = str.substring(0, str.length() - 2);
            }
        }

        result += last;
        result += secondLast;

        return result;
    }

    public static void main(String[] args) {
        String str = "Blow";
        System.out.println("Given string: " + str);
        System.out.print("Altered string: ");
        System.out.println(swapLastTwo(str));

    }
}
