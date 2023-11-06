package com.elhg.pojos;

public class NumberDaysOfMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }


    public static int getDaysInMonth(int month, int year){
        if(month>=1 && month<=12){
            if(year>=1 && year<=9999){
               return  switch(month){
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 2 -> {
                        if(isLeapYear(year)){
                            yield  29;
                        }else{
                            yield  28;
                        }
                    }
                    case 4, 6, 9, 11-> 30;
                   default -> -1;
                };
            }
        }
        return -1;
    }

    public static boolean isLeapYear(int year){
        boolean response = false;
        if( year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && !(year % 100 == 0)) || (year % 400 == 0)) {
                response = true;
            } else {
                response = false;
            }
        }
        return response;
    }
}
