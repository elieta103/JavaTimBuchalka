package com.elhg.constructor;

public class Main {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        System.out.println(constructor);
        constructor =  new Constructor("Ian", 1000, "ian@mail.com");
        System.out.println(constructor);
        constructor =  new Constructor("Dany", "dany@mail.com");
        System.out.println(constructor);

    }
}
