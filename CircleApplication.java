//Applications that runs the Circle class
package CircleApplication;

import za.ac.wsu.s217120407.Circle;

/**
 *
 * @author 217120407 Zonke 
 * 
 */

public class CircleApplication {

    public static void main(String[] args) {

        Circle myCircle1 = new Circle(); // creates an object of Circle
        myCircle1.setRadius(4);          //Calling the set function fot the radius 
        myCircle1.setX(2);               //Calling the set function fot the x coordinate 
        myCircle1.setY(2);               //Calling the set function fot the y coordinate 

        Circle myCircle2 = new Circle(); // creates an object of Circle
        myCircle2.setRadius(2);         //Calling the set function fot the radius 
        myCircle2.setX(0);              //Calling the set function fot the x coordinate 
        myCircle2.setY(0);              //Calling the set function fot the y coordinate 

        Circle myCircle3 = new Circle(); // creates an object of Circle
        myCircle3.setRadius(-2);        //Calling the set function fot the radius 
        myCircle3.setX(1);              //Calling the set function fot the x coordinate
        myCircle3.setY(2);              //Calling the set function fot the y coordinate 

        //Printing to the screen 
        System.out.println("		Circle 1");
        System.out.println("Radius  = " + myCircle1.getRadius());       //Printining the value of the radius 
        System.out.println("x   = " + myCircle1.getX());                //Printining the value of the x coordinates  
        System.out.println("y   = " + myCircle1.getY());                //Printining the value of the y coordinates
        System.out.println();                                           //Prints a new line 

        System.out.println("Area		: " + myCircle1.calculateArea());           //Printining the computed Area 
        System.out.println("Circumference	: " + myCircle1.calculateCircumference());  //Printining the computed Circumference
        System.out.println("Diameter	: " + myCircle1.calculateDiameter());               //Printining the computed Diameter
        System.out.println();

        System.out.println("		Circle 2");
        System.out.println("Radius  = " + myCircle2.getRadius());       //Printining the value of the radius 
        System.out.println("x   = " + myCircle2.getX());                //Printining the value of the x coordinates  
        System.out.println("y   = " + myCircle2.getY());                //Printining the value of the y coordinates
        System.out.println();

        System.out.println("Area		: " + myCircle2.calculateArea());           //Printining the computed Area
        System.out.println("Circumference	: " + myCircle2.calculateCircumference());  //Printining the computed Circumference
        System.out.println("Diameter	: " + myCircle2.calculateDiameter());               //Printining the computed Diameter
        System.out.println();                                           //Prints a new line 

        System.out.println("		Circle 3");
        System.out.println("Radius  = " + myCircle3.getRadius());       //Printining the value of the radius 
        System.out.println("x   = " + myCircle3.getX());                //Printining the value of the x coordinates 
        System.out.println("y   = " + myCircle3.getY());                //Printining the value of the y coordinates
        System.out.println();                                           //Prints a new line 

        System.out.println("Area		: " + myCircle3.calculateArea());           //Printining the computed Area
        System.out.println("Circumference	: " + myCircle3.calculateCircumference());  //Printining the computed Circumference
        System.out.println("Diameter	: " + myCircle3.calculateDiameter());               //Printining the computed Diameter
        System.out.println();                                           //Prints a new line 
    }//End of main

}//End of class CircleApplication
