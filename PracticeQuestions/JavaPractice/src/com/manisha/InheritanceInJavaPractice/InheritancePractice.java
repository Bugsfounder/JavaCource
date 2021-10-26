package com.manisha.InheritanceInJavaPractice;

class Circle {
    private int radius;
    private int perimeter;

    Circle() {

    }

    Circle(int radius, int perimeter) {
        this.perimeter = perimeter;
        this.radius = radius;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}


class Cylinder extends Circle {
    Cylinder(int radius, int perimeter) {
        super(radius, perimeter);
    }
}

public class InheritancePractice {
    public static void main(String[] args) {

    }
}
