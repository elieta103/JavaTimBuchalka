package com.elhg.constructor;

public class Constructor {

    private  String name;
    private double creditLimit;
    private String email;

    public Constructor(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Constructor() {
        this("Eliel", 2000, "mail@mail.com");
    }

    public Constructor(String name, String email) {
        this(name, 3000, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }
}
