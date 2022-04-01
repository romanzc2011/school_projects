/*
 * File: Circle_Campbell_Roman.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 3/8/2022
 * Java class description: This class will create a Circle object with its own float radius, and 
   a point to signify the x,y coordinate user inputs
 */

package csc145exam1;

import java.awt.Point;
import java.text.DecimalFormat;

public class Circle_Campbell_Roman implements Calculable {
    //==============================================================================================
    //==============================================================================================
    //==== VARIABLES
    //==============================================================================================
    //==============================================================================================
    private float radius;
    private int xPos, yPos;
    private Point pt;
    // Formatter to display only 2 decimal points in float data types-------------------------------
    private DecimalFormat df;

    
    //==============================================================================================
    //==============================================================================================
    //==== CONSTRUCTORS
    //==============================================================================================
    //==============================================================================================
    // Default constructor--------------------------------------------------------------------------
    public Circle_Campbell_Roman() {
        
    }
    
    public Circle_Campbell_Roman(float radius, int xPos, int yPos) {
        this.radius = radius;
        this.xPos = xPos;
        this.yPos = yPos;
        // Create the point object to reference points on the shapes--------------------------------
        pt = new Point(this.xPos, this.yPos);
    }
    
    
    //==============================================================================================
    //==============================================================================================
    //==== METHODS
    //==============================================================================================
    //==============================================================================================
    public float getArea() {
        float area;
        area = (float)Math.PI * (float)(Math.pow(radius, 2));
        return area;
    }

    
    public float getPerimeter() {
        float circumference;
        circumference = 2 * (float)(Math.PI * radius);
        return circumference;
    }

    public Point getLocation() {
        return pt.getLocation();
    }
    
    // toString method to display shape information-------------------------------------------------
    public String toString() {
        String result = "";
        Point coord;
        coord = getLocation();
        df = new DecimalFormat("#.00");
        
        result += "*** Circle\n";
        result += "Radius: " + df.format(radius) + "\n";
        result += "Area (PI * r^2): " + df.format(getArea()) + "\n";
        result += "Perimeter: (2 * PI * r): " + df.format(getPerimeter()) + "\n";
        result += "Location: (" + coord.x + "," + coord.y + ")\n\n";
        return result;
    }

}
