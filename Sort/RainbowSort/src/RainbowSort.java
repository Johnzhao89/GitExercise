/**
 * Copyright (c) Shutterfly.com, Inc. 2015.  All Rights Reserved.
 *
 * abcccabbcbbacaa → aaaaabbbbbccccc
 */
public class RainbowSort {

    public static String sort (String input) {

        if (input == null || input.length() == 0) {
            return null;
        }

        int i = 0;
        int j = 0;
        int k = input.length() - 1;
        char[] chars = input.toCharArray();

        while (j <= k) {
            if (chars[j] == 'a') {
                swap(chars,i++,j++);
            }
            else if (chars[j] == 'b') {
                j++;
            }
            else {
                swap(chars, j, k);
                k--;
            }
        }
        return String.valueOf(chars);
    }

    private static void swap(char[] input, int i, int k) {
        char temp = input[i];
        input[i] = input[k];
        input[k] = temp;
    }


    public static void main (String[] args) {
        String input = "abcccabbcbbacaa";
        System.out.println(sort(input));
    }

}
