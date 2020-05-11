package com.strings;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String words = "a good   example";

        System.out.println(reverseWords(words));
    }
    public static String reverseWords(String s) {
        String result = "";
        String ss = s.trim();
        List<String> list = Arrays.asList(ss.split("\\s+"));
        Collections.reverse(list);
        result = list.stream().collect(Collectors.joining(" "));
        return result;
    }
    public static void printArr(String[] words){
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
    }
}
