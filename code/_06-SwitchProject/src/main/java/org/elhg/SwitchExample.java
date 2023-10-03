package org.elhg;

public class SwitchExample {
    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "JANUARY";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
        System.out.println(month + " is in the " + getQuarter2(month) + " quarter");

    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                yield "1st";
            }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                yield  month + " is bad";
            }
        };

    }

    public static String getQuarter2(String month) {

        switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH":
                return "1st";
            case "APRIL", "MAY", "JUNE":
                return "2nd";
            case "JULY", "AUGUST", "SEPTEMBER":
                return "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER":
                return "4th";
            default:
                return month + " is bad";
        }

    }
}