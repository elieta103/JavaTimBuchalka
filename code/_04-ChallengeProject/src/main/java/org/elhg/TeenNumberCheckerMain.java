package org.elhg;

public class TeenNumberCheckerMain {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int n1, int n2, int n3){
        boolean response = false;
        if(isTeen(n1) || isTeen(n2) || isTeen(n3)){
            response = true;
        }
        return response;
    }

    public static boolean isTeen(int n1){
        boolean response = false;
        if(n1 >=13 && n1<=19){
            response = true;
        }
        return response;
    }
}