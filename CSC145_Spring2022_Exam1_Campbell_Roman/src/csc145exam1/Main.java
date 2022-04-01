/*
 * File: Main.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 3/8/2022
 * Java class description: Drive class for all the shape classes of the program
 */

package csc145exam1;

public class Main {

    
    public static void main(String[] args) {
    //==============================================================================================
    //==============================================================================================
    //==== OBJECTS
    //==============================================================================================
    //==============================================================================================
        Rectangle_Campbell_Roman rectangle = new Rectangle_Campbell_Roman((float)3.1, 
          (float)7.4, 200, 150);
        
        Parallelogram_Campbell_Roman parallelogram = new Parallelogram_Campbell_Roman((float)5.6,
          (float)6.7, 200, 100);
        
        RightTriangle_Campbell_Roman rightTriangle = new RightTriangle_Campbell_Roman((float)13.2, 
          (float)17, 95, 100);
        
        Circle_Campbell_Roman circle = new Circle_Campbell_Roman((float)2.5, 100, 100);

        
        // Calls toString method for all the objects to display their information-------------------
        System.out.println();
        System.out.println("***** Roman Campbell (Cybersecurity and Networking)\n");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(rightTriangle);
        System.out.println(parallelogram);
        
    }

}
