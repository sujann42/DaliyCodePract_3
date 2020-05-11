package com.strings;

public class NoOfLinedToWritString {
    public static void main(String[] args) {
        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String S = "bbbcccdddaaa";
        numberOfLines(widths, S);
    }

    public static void numberOfLines(int[] widths, String S) {
        int sum = 0; //to track sum
        int lineCount = 0; // counting number of lines so far.
        int[] result = new int[2]; //array of size 2 to

        for (int i = 0; i < S.length(); i++) {
            int valueOfChar = (int) S.charAt(i);
            //System.out.println(valueOfChar);
            sum += widths[valueOfChar - 97];
            if (sum == 100) {
                lineCount++;
                sum = sum - 100;
            } else if (sum > 100) {
                lineCount++;
                sum = widths[valueOfChar - 97];
                if (i == S.length() - 1) {
                    lineCount++;
                }
            } else if (i == S.length() - 1) {
                lineCount++;
            }

        }
        System.out.println("Sum is: " + sum);
        result[0] = lineCount;
        result[1] = sum;

        //return result;
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
