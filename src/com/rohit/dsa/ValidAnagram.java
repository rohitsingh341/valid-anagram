package com.rohit.dsa;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
//        String s1 = "abcd";
//        String s2 = "bcad";
        String s1 = "anagram";
        String s2 = "nagaram";

        boolean isAnagram = isValidAnagramSolution2(s1, s2);
        System.out.println("isAnagram -> " + isAnagram);
    }

    public static boolean isValidAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        return Arrays.equals(s1Arr, s2Arr);

    }

    //Solution 2 - if interviewer does not favour using inbuilt function as used in above solution
    private static boolean isValidAnagramSolution2(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charStore = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            charStore[s1.charAt(i) - 'a']++;
            charStore[s2.charAt(i) - 'a']--;
        }

        for (int n : charStore) {
            if (n != 0) {
                return false;
            }
        }

        return true;
    }
}
