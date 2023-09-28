package org.elhg;

public class BarkingDogMain {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true , 1 ));
        System.out.println(shouldWakeUp (true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean response = false;
        if (barking){
            if (hourOfDay < 0 || hourOfDay > 23){
                response = false;
            }else if (hourOfDay < 8 || hourOfDay > 22){
                response = true;
            }
        }
        return response;
    }
}