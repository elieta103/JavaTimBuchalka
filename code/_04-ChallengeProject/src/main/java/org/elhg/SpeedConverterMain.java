package org.elhg;

public class SpeedConverterMain {
    public static void main(String[] args) {
       printConversion(100);
       printConversion(-2.0);
    }

    public static long toMilesPerHour (double kilometersPerHour){
        long valueMiles = 0;
        if(kilometersPerHour < 0.00){
            valueMiles = -1;
        }else if (kilometersPerHour > 0){
            valueMiles = Math.round(kilometersPerHour / 1.609 );
        }
        return  valueMiles;
    }

    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }
}