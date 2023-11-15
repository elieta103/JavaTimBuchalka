package org.elhg.challenge07;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9};
        reverse(arr);
    }

    private static void reverse (int[] array){
         int[] arrayReverse = new int[array.length];
         int j = 0;
         for (int i=array.length-1; i>=0 ; i-- ) {
            arrayReverse[j] = array[i];
            j++;
         }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayReverse));
    }
}
