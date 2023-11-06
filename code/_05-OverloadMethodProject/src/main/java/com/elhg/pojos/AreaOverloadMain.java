package com.elhg.pojos;

public class AreaOverloadMain {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius){
        double response = -1.0;
        if(!(radius < 0)){
            response = Math.PI * Math.pow(radius, 2);
        }
        return response;
    }

    public static double area(double x, double y){
        double response = -1.0;
        if(!(x < 0 || y < 0)){
            response = x * y;
        }
        return response;
    }

}
