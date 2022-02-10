package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Cirle {
    static private double pi;
    static private int radius;

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void area (){
        System.out.println("Area is: "+Math.PI*(radius*radius));

    }
    public static void circumference(){
        System.out.println("Circumference is: "+Math.PI * (2 * radius));
    }
}
