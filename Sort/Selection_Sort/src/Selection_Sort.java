import java.util.Arrays;

/**
 * Copyright (c) Shutterfly.com, Inc. 2015.  All Rights Reserved.
 *
 * example:inta[i]={-1,-3,4,7}=>{-3,1,4,7}ascendingorder
 * 1.Selectionsort:
 * iteration 1: find global min -3 {-3,-1,4,7} insert 3 to the right place
 * iteration 2 ; find global min in the rest -3 {-1,4,7}=> -3 -1 {4,7}
 * iteration 3 ; find global min in the rest -3 -1{4,7}=> -3 -1 4{7}
 * iteration 4 ; find global min and done
 */
public class Selection_Sort {

    public static int[] sort(int[] input, int n) {
        if (input == null || input.length == 0) {
            return input;
        }

        int global;
        int index;
        for (int i = 0; i < n-1; i++){
            global = input[i];
            index = i;
            for(int j = i+1; j < n; j++){
                if(input[j] < global){
                  index = j;
                  global = input[j];
                }
            }
            int temp = input[index];
            input[index] = input[i];
            input[i] = temp;

        }
        return input;
    }


    public static void main(String[] args) {
        int[] input = {-1, -3, 4, 7};
        System.out.println(Arrays.toString(sort(input,4)));
    }

}
