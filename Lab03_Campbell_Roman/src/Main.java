/*
 * File: Main.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 2/26/2022
 * Java class description: This driver class creates two objects of type MyRectangle 
                           and MyEllipse
 */

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        double width, height, sideA, sideB;
        
        // Rectangle Example
        // Creates a scanner object to test multiple values
        System.out.println("Rectangle Example----------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter width of rectangle: ");
        width = scan.nextDouble();
        
        System.out.println("Enter height of rectangle: ");
        height = scan.nextDouble();
        
        // --- Create MyRectangle using the supplied width and height-------------------------------
        MyRectangle myRect = new MyRectangle(width, height);
        
        // Call the toString method of MyRectangle class
        System.out.println("\n");
        System.out.println(myRect);
        System.out.println("\n");
        System.out.println("Area: " + myRect.getArea() + " square units");
        System.out.println("Perimeter: " + myRect.getPerimeter() + " units\n\n");
        
        // Ellipse Example
        System.out.println("Ellipse Example------------------------------------------------------");
        
        System.out.println("Enter side A: ");
        sideA = scan.nextDouble();
        
        System.out.println("Enter side B: ");
        sideB = scan.nextDouble();
        
        // --- Create MyEllipse using supplied side A and B
        MyEllipse myEllip = new MyEllipse(sideA, sideB);
        
        // Call the toString method of MyEllipse to display myEllip info
        System.out.println("\n");
        System.out.println(myEllip);
        System.out.println("\n");
        System.out.println("Area: " + myEllip.getArea() + " square units");
        System.out.println("Perimeter: " + myEllip.getPerimeter() + " square units");
        
    }

}
