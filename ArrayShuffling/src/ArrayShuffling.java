import java.util.Arrays;

/**
 * Copyright (c) Shutterfly.com, Inc. 2015.  All Rights Reserved.
 *
 * Given an array with integers, move all "0s" to the right-end of the array(2个挡板，3个区域)
 * Example int a[7] = {1,0,-4,-5,0,2,3} -> {1,-4,-5,2,3,0,0}
 */
public class ArrayShuffling {

    public static void shuffling(int[] input) {
        if(input == null || input.length == 0) {
            return;
        }

        int left = 0;
        int right = input.length - 1;

        while (left < right) {
            if(input[left] == 0) {
                swap(input, left, right);
                right--;
            }
            else
                left++;
        }

    }

    private static void swap(int[] input, int left, int right) {
        int temp = input[left];
        input[left] = input[right];
        input[right] = temp;
    }

    public static void main(String[] args) {
        //int[] input = {1,0,-4,-5,0,2,3};
        int input[] = {0,0};
        shuffling(input);
        System.out.println(Arrays.toString(input));
    }

}
