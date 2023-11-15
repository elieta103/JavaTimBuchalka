package org.elhg.challenge04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainOrderDescArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noElements = scanner.nextInt();

        int[] arrayOriginal = getRandomArray(noElements);
        System.out.println("Array original");
        System.out.println(Arrays.toString(arrayOriginal));
        Arrays.sort(arrayOriginal);
        System.out.println("Array order ASC");
        System.out.println(Arrays.toString(arrayOriginal));

        int[] arrayOrderDesc = new int[arrayOriginal.length];
        int j=0;
        for (int i=arrayOriginal.length-1; i>=0; i--){
            arrayOrderDesc[j] = arrayOriginal[i];
            j++;
        }
        System.out.println("Array order DESC");
        System.out.println(Arrays.toString(arrayOrderDesc));
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }


    private static int[] sortIntegers(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }

}
