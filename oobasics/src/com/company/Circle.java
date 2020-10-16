package com.company;

public class Circle {


    private double radius;
    private double x;
    private double y;

    public Boolean hasIntersection(Circle other) {
        double dist = Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
        return dist <= radius + other.radius;
    }

    public double getArea(){

        final double PI = 3.1415926535;
        return Math.sqrt(radius)*PI;

    }

    public double getCircumference(){
        final double PI = 3.1415926535;
        return 2*radius*PI;
    }




}


