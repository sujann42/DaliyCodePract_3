package com.strings;

public class LicensePlateShortWords {
    public static void main(String[] args) {
        String s = "s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        System.out.println(shortestCompletingWord(s, words));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        char[] charArr = licensePlate.toCharArray();
        String wordResult = words[0];
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].indexOf(charArr[i]) != -1) {
                    if(words[j].length() < wordResult.length()){
                        wordResult = words[j];
                    }
                }

            }
        }
        return wordResult;
    }
}

/*
*
                        if(words[j].length() >= 0 && wordResult.length() > words[j].length()){
                            wordResult = words[j];
                        }else {
                            wordResult= wordResult;
                        }*/


