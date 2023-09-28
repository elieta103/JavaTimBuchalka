package org.elhg;

public class EqualSumCheckerMain {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum (int n1, int n2, int n3){
        boolean response = false;
        int sum = n1 + n2;
        if(sum==n3){
            response = true;
        }
        return response;
    }
}