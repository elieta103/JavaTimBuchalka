package com.elhg.pojos;

public class CatPlayingMain {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean  isCatPlaying(boolean summer, int temperature){
        boolean response = false;
        if(summer){
            if(temperature >= 25 && temperature <=45){
                response = true;
            }
        }else{
            if(temperature >= 25 && temperature <=35){
                response = true;
            }
        }

        return response;
    }
}
