package com.company;

public class Point {

    private int x, y, color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x=0;
        this.y=0;
    }

    // Metódus ****

    public int[] printInfo() {
        int[] pointXYQuarter = new int[3];

        pointXYQuarter[0]=x;
        pointXYQuarter[1]=y;

        if (x > 0) {
            if (y > 0) {
                pointXYQuarter[2] = 1;
            } else {
                pointXYQuarter[2] = 2;
            }
        } else {
            if (y < 0) {
                pointXYQuarter[2] = 3;
            } else {
                pointXYQuarter[2] = 4;
            }
        }
        System.out.println(pointXYQuarter[0] +" "+ pointXYQuarter[1]  +" "+pointXYQuarter[2]);
        return pointXYQuarter;

    }

    public double distance(Point otherPoint){
         double dist = Math.sqrt(Math.pow(otherPoint.x -x, 2) + Math.pow(otherPoint.y - y, 2));

      return dist;
    }


}
