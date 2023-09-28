package org.elhg;

public class MegaBytesConverterMain {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megaBytes = kiloBytes / 1024;
            int reminderKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+reminderKiloBytes+" KB");
        }
    }
}