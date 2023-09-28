package org.example;

public class SecondsMinutesMain {
    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }

    public static String getDurationString(int seconds){
        String response = "";
        if(seconds>=0){
            response = getDurationString( seconds/60, seconds%60 );
        }else{
            response = "Invalid data ";
        }

        return response;
    }

    public static String getDurationString(int minutes, int seconds){
        String response = "";
        if(seconds>=0 && seconds<=59){
            int hours = minutes / 60;
            int minutesRemaining = minutes % 60;
            response = hours+"h "+minutesRemaining+"m "+seconds+"s";
        }else{
            response = "Invalid data";
        }
        return response;
    }
}