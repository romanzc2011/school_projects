/*
 * File: RightTriangle_Campbell_Roman.java
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 3/9/2022
 * Java class description: This class will create a triangle object with perimeter, area, and 
   location data.
 */

package csc145exam1;

import java.awt.Point;
import java.text.DecimalFormat;

public class RightTriangle_Campbell_Roman implements Calculable {
    //==============================================================================================
    //==============================================================================================
    //==== VARIABLES
    //==============================================================================================
    //==============================================================================================
    private float base, height, hypotenuse;
    private int xPos, yPos;
    private Point pt;
    private DecimalFormat df;

    
    //==============================================================================================
    //==============================================================================================
    //==== CONSTRUCTORS
    //==============================================================================================
    //==============================================================================================
    // Default contructor---------------------------------------------------------------------------
    public RightTriangle_Campbell_Roman() {
        
    }
    
    public RightTriangle_Campbell_Roman(float base, float height, int xPos, int yPos) {
        this.base = base;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        pt = new Point(this.xPos, this.yPos);
    }
    
    
    //==============================================================================================
    //==============================================================================================
    //==== METHODS
    //==============================================================================================
    //==============================================================================================
    public float getArea() {
        return (height * base) / 2;
    }

    public float getPerimeter() {
        // Find Hypotenuse
            hypotenuse = (float)Math.sqrt((Math.pow(base, 2)) + (Math.pow(height, 2)));
            return height + base + hypotenuse;
    }

    public Point getLocation() {
        return pt.getLocation();
    }
    
    public String toString() {
        String result  = "";
        Point coord;
        coord = getLocation();
        df = new DecimalFormat("#.00");
        
        result += "*** Right Triangle\n";
        result += "Height: " + height + "\n";
        result += "Base: " + base + "\n";
        result += "Area (height * base / 2): " + df.format(getArea()) + "\n";
        result += "Perimeter (base + height + hypotenuse): " + df.format(getPerimeter()) + "\n";
        result += "Location: (" + coord.x + "," + coord.y + ")\n\n";
        return result;
    }

}
