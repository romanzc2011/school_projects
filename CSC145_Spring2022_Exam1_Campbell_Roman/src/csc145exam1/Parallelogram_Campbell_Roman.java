/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 3/8/2022
 * Java class description: This class will create a Parallelogram with height and width with 
   location points. Will also find the parameter by finding the diagonals using formulas below.
   a^2 + b^2 = c^2
   sqrt(c^2)
 */

package csc145exam1;

import java.awt.Point;
import java.text.DecimalFormat;


public class Parallelogram_Campbell_Roman implements Calculable {
    //==============================================================================================
    //==============================================================================================
    //==== VARIABLES
    //==============================================================================================
    //==============================================================================================
    private float width, height;
    private int xPos, yPos;
    private Point pt;
    private DecimalFormat df;
    
    
    //==============================================================================================
    //==============================================================================================
    //==== CONSTRUCTORS
    //==============================================================================================
    //==============================================================================================
    // Default constructor--------------------------------------------------------------------------
    public Parallelogram_Campbell_Roman() {
        
    }
    
    public Parallelogram_Campbell_Roman(float width, float height, int xPos, int yPos) {
        this.width = width;
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
        return (float)width * height;
    }

    public float getPerimeter() {
        return (2 * width) + (2 * height);
    }

    public Point getLocation() {
        return pt.getLocation();
    }
    
    public String toString() {
        String result = "";
        Point coord;
        coord = getLocation();
        df = new DecimalFormat("#.00");
        
        result += "*** Parallelogram\n";
        result += "Width: " + width + "\n";
        result += "Height: " + height + "\n";
        result += "Area (width * height): " + df.format(getArea()) + "\n";
        result += "Perimeter: (2 * width) + (2 * height): " + df.format(getPerimeter()) + "\n";
        result += "Location: (" + coord.x + "," + coord.y + ")\n\n";
        return result;
    }

}
