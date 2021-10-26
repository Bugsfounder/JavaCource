package com.codewithharry.shape;
import java.util.Scanner;

/*
 **** IMPORTANT NOTE:- USE NOTEPAD FOR SOLVE THIS QUESTION ****

You have to create a package named com.codewithharry.shape
This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
These classes should use inheritance to properly manage the code!
Include methods like volume(), surface(), area() and getters/setters for dimensions
 */


class Rectangle{
// Volume = l × w × h 
public int length, height, width;
Scanner input = new Scanner(System.in);
public void volume(){
	System.out.print("Enter Height of Rectangle: ");
	height = input.nextInt();
	System.out.print("Enter Width  of Rectangle: ");
	width = input.nextInt();
	System.out.println("The volume of Rectangel is: "+ length*width*height);
    }


}

public class Excercise5 {
    public static void main(String[] args) {
	System.out.println("This is Excercise Class");

	Rectangle rec = new Rectangle();
	
	rec.volume();

    }
}


