/*
EX NO : 6		PROGRAM TO CALCULATE AREA USING ABSTRACT CLASS


AIM

To write a java program to calculate the area of rectangle,circle and triangle using the concept of abstract class.

PROCEDURE

1. Create an abstract class named shape that contains two integers and an empty method named   
    printarea().

2. Provide three classes named rectangle, triangle and  circle such that each one of the classes 
    extends the class Shape.

3.Each of the inherited class from shape class should provide the implementation for the method 
   printarea().

4.Get the input and calculate the area of rectangle,circle and triangle .

5. In the shapeclass , create the objects for the three inherited classes and invoke the methods and 
    display the  area values of the different shapes.
*/
import java.util.*;
import java.io.*;

abstract class shape
{
    int a, b;
    public abstract void printarea() ;

}
class rectangle extends shape
{
    public void printarea()
    {
        int a,b;
        Scanner A = new Scanner(System.in);
        System.out.print(" Enter the length of Rectange : ");
        a = A.nextInt();
        System.out.print(" Enter the breath of Rectange : ");
        b = A.nextInt();
        System.out.println(" Area : "+a*b);
    }

}
class triangle extends shape
{
    public void printarea()
    {
        int a,b;
        Scanner A = new Scanner(System.in);
        System.out.print(" Enter the height of Triangle : ");
        a = A.nextInt();
        System.out.print(" Enter the breath of Triangle : ");
        b = A.nextInt();
        System.out.println(" Area : "+a*b*0.5);
    }

    
}
class circle extends shape
{
    public void printarea()
    {
        int a;
        Scanner A = new Scanner(System.in);
        System.out.print(" Enter the radius of Circle : ");
        a = A.nextInt();
        System.out.println(" Area : "+3.14*a*a);
    }

    
}
class Area
{
    public static void main(String args[])
    {
        rectangle R = new rectangle();
        R.printarea();
        triangle T = new triangle();
        T.printarea();
        circle C = new circle();
        C.printarea();

    }
    
}
